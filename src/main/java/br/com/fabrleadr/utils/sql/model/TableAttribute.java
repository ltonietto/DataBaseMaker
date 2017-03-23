package br.com.fabrleadr.utils.sql.model;

/**
 *
 * @author ltonietto
 */
public class TableAttribute implements Comparable<TableAttribute> {

    private String attrName;
    private String attrComment;
    private Integer attrOrder;
    private String attrType;
    private Integer attrSize;
    private Integer attrDecimalSize;
    private Constraint constraint;
    private String defaultValue;
    private Boolean mandatory;

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    public Integer getAttrSize() {
        return attrSize;
    }

    public void setAttrSize(Integer attrSize) {
        this.attrSize = attrSize;
    }

    public Integer getAttrDecimalSize() {
        return attrDecimalSize;
    }

    public void setAttrDecimalSize(Integer attrDecimalSize) {
        this.attrDecimalSize = attrDecimalSize;
    }

    public Constraint getConstraint() {
        return constraint;
    }

    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }

    public String getAttrComment() {
        return attrComment;
    }

    public void setAttrComment(String attrComment) {
        this.attrComment = attrComment;
    }

    public Integer getAttrOrder() {
        return attrOrder;
    }

    public void setAttrOrder(Integer attrOrder) {
        this.attrOrder = attrOrder;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    @Override
    public int compareTo(TableAttribute o) {
        return this.attrOrder.compareTo(o.attrOrder);
    }

    public boolean hasInlineConstraint() {
        return (constraint != null) && (constraint instanceof CheckConstraint);
    }

}
