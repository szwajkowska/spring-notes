package notes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class BodyRequest {

    @NotEmpty
    @Length(min = 3, max = 20)
    private final String text;

    @JsonCreator
    public BodyRequest(@JsonProperty("text") String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
