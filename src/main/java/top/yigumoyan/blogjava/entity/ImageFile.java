package top.yigumoyan.blogjava.entity;

import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ImageFile {
    private int id;
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }
}
