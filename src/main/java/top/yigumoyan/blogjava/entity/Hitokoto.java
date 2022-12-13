package top.yigumoyan.blogjava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hitokoto {
    private int id;
    private String say;
    private String fromArt;
    private String fromWho;
}
