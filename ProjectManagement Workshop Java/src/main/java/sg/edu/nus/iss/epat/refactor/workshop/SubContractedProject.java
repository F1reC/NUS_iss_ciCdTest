package sg.edu.nus.iss.epat.refactor.workshop;

public class SubContractedProject {
    private Project project;
    private String subContractedCompany = null;
    private String contactPerson = null;

    public SubContractedProject() {
        this.project = new Project();
    }

    // Delegating Project methods that are applicable
    public String getName() {
        return project.getName();
    }

    public void setName(String name) {
        project.setName(name);
    }

    public Duration getDuration() {
        return project.getDuration();
    }

    public void setDuration(Duration duration) {
        project.setDuration(duration);
    }

    public double getRate() {
        return project.getRate();
    }

    public void setRate(double rate) {
        project.setRate(rate);
    }

    public int getEffortRequired() {
        return project.getEffortRequired();
    }

    public void setEffortRequired(int effortRequired) {
        project.setEffortRequired(effortRequired);
    }

    // Specific methods for SubContractedProject
    public String getSubContractedCompany() {
        return subContractedCompany;
    }

    public void setSubContractedCompany(String subContractedCompany) {
        this.subContractedCompany = subContractedCompany;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
}
