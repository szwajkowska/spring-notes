package notes;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NotesRepository {

    private final AtomicLong counter = new AtomicLong();

    private Map<Long, Note> notes = new HashMap<Long, Note>();

    public Collection<Note> getNotes() {
        return notes.values();
    }

    public long add(String body){
        long id = counter.incrementAndGet();
        notes.put(id, new Note(id, body));
        return id;
    }

    public Note findById(Long id) {
        return notes.get(id);
    }

    public void deleteNote(Long id) {
        notes.remove(id);
    }

    public void changeBody(Long id, String body) {
//        notes.remove(id);
        notes.put(id, new Note(id, body));
    }
}
