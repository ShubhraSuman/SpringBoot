package com.spring.basic.com.spring.basic.TopicController;

public class Topics {
    private String topicId;
    private String topicName;
    private String topicDesc;
    public Topics() {
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicDesc = topicDesc;
    }
    public Topics(String topicId, String topicName, String topicDesc) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicDesc = topicDesc;
    }

    public String getTopicId() {
        return topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getTopicDesc() {
        return topicDesc;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public void setTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc;
    }


}
