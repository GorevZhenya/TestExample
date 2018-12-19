package api.response.models;

public class TierOneVerificationPositiveResponseData {
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String nickName;
    private String phoneNumber;
    private Boolean bounty;
    private String credibilityLevel;
    private VerifyTier1PositiveResponseData2 veriffDecision;
    private String totpStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getBounty() {
        return bounty;
    }

    public void setBounty(Boolean bounty) {
        this.bounty = bounty;
    }

    public String getCredibilityLevel() {
        return credibilityLevel;
    }

    public void setCredibilityLevel(String credibilityLevel) {
        this.credibilityLevel = credibilityLevel;
    }

    public VerifyTier1PositiveResponseData2 getVeriffDecision() {
        return veriffDecision;
    }

    public void setVeriffDecision(VerifyTier1PositiveResponseData2 veriffDecision) {
        this.veriffDecision = veriffDecision;
    }

    public String getTotpStatus() {
        return totpStatus;
    }

    public void setTotpStatus(String totpStatus) {
        this.totpStatus = totpStatus;
    }


}
