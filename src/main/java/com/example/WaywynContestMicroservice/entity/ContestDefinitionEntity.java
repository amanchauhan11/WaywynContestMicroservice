package com.example.WaywynContestMicroservice.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="contestdefinition")
public class ContestDefinitionEntity {
    @Id
    @GeneratedValue
   private Integer contestId;

   private Integer CategoryId;

    @Column(unique = true)
    private String contestName;

    @NotNull
    private String createdBy;

    @NotNull
    private Date createdOnDate;

    @NotNull
    @Column(columnDefinition =" integer default 2 ")
    private Integer skipsAllowed;

    @NotNull
    @Column(columnDefinition="varchar(255) default 'static'")
    private String contestType;

    private Date startTimeOfContest;

    private Date endTimeOfContest;

    @NotNull
    @Column(columnDefinition=" integer default 10 ")
    private Integer totalQuestionsInContest;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "contest_id_contest_id"), inverseJoinColumns = @JoinColumn(name = "question_id_question_id"))
//    private Set<QuestionEntity> questionList;


    @Override
    public String toString() {
        return "ContestDefinitionEntity{" +
                "contestId=" + contestId +
                ", contestName='" + contestName + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOnDate=" + createdOnDate +
                ", skipsAllowed=" + skipsAllowed +
                ", contestType='" + contestType + '\'' +
                ", startTimeOfContest=" + startTimeOfContest +
                ", endTimeOfContest=" + endTimeOfContest +
                ", totalQuestionsInContest=" + totalQuestionsInContest +
                '}';
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        CategoryId = categoryId;
    }

    public Integer getContestId() {
        return contestId;
    }

    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOnDate() {
        return createdOnDate;
    }

    public void setCreatedOnDate(Date createdOnDate) {
        this.createdOnDate = createdOnDate;
    }

    public Integer getSkipsAllowed() {
        return skipsAllowed;
    }

    public void setSkipsAllowed(Integer skipsAllowed) {
        this.skipsAllowed = skipsAllowed;
    }

    public String getContestType() {
        return contestType;
    }

    public void setContestType(String contestType) {
        this.contestType = contestType;
    }

    public Date getStartTimeOfContest() {
        return startTimeOfContest;
    }

    public void setStartTimeOfContest(Date startTimeOfContest) {
        this.startTimeOfContest = startTimeOfContest;
    }

    public Date getEndTimeOfContest() {
        return endTimeOfContest;
    }

    public void setEndTimeOfContest(Date endTimeOfContest) {
        this.endTimeOfContest = endTimeOfContest;
    }

    public Integer getTotalQuestionsInContest() {
        return totalQuestionsInContest;
    }

    public void setTotalQuestionsInContest(Integer totalQuestionsInContest) {
        this.totalQuestionsInContest = totalQuestionsInContest;
    }
}
