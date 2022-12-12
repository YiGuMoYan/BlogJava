package top.yigumoyan.blogjava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Markdown {
    private String title;
    private String classification;
    private String markdown;
    private Date time;
}
