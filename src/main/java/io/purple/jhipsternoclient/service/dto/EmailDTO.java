package io.purple.jhipsternoclient.service.dto;

import java.util.List;

public class EmailDTO {

    private String templateId; // mail template

    private List<String> tagExpression; // to whom the email will be sent

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public List<String> getTagExpression() {
        return tagExpression;
    }

    public void setTagExpression(List<String> tagExpression) {
        this.tagExpression = tagExpression;
    }

}
