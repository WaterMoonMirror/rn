package com.tkn.rn.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import org.springframework.data.web.JsonPath;

@Data
public class BookDomain {
    /**
     * "bid": "7034781",
     *             "bookname": "乡村美女图",
     *             "introduction": "乡村赤脚小医生叶福贵，机缘巧合偶获仙府，担负起寻找转世仙女美女的任务，同时，带领着乡亲们走上富裕的阳光大道。 寻找一个个仙子美女，那也是一个技术活，和一个个仙女一起生活，更是一门艺术，叶福贵这个仙府主人，养活一大堆仙女，太幸福操劳了。 这个幸福的操劳，放着我来，谁都别抢。",
     *             "book_info": "乡村赤脚小医生叶福贵，机缘巧合偶获仙府，担负起寻找转世仙女美女的任务，同时，带领着乡亲们走上富裕的阳光大道。 寻找一个个仙子美女，那也是一个技术活，和一个个仙女一起生活，更是一门艺术，叶福贵这个仙府主人，养活一大堆仙女，太幸福操劳了。 这个幸福的操劳，放着我来，谁都别抢。",
     *             "chapterid": "1010932",
     *             "topic": "第一千一百四十章视察工作",
     *             "topic_first": "第一章和美女村长一起看春戏",
     *             "date_updated": 1525350909,
     *             "author": "3644907",
     *             "author_name": "老婆爱我",
     *
     */
    private int bid;
    private String bookname;
    private String introduction;
    @JSONField(name = "book_info")
    private String bookInfo;
    private  int chapterid;
    private String topic;
    @JSONField(name = "date_updated")
    private String  topicFirst;
    @JSONField(name = "author_name")
    private  String authorName;
}
