package notes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Note {

    private long id;
    private String body;

    @JsonCreator
    public Note(@JsonProperty long id,@JsonProperty String body) {
        this.id = id;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toString(){
        return "Note{" +
            "id='" + id + '\'' +
            ", body=" + body +
            '}';
    }


}
