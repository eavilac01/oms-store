package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import page.WorkFlowPage;

public class WorkFlowCenterStep {

    WorkFlowPage workFlow = new WorkFlowPage();

    @When("^Select a (.+) of the hub organization combo$")
    public void workFlowHubOrganization(String organization) {
        workFlow.inputHubOrganization(organization);
    }

    @And("^Select inventory option$")
    public void workFlowClickInventoryOption(){
        workFlow.clickInventoryOption();
    }

    @And("^Select node capacity option$")
    public void workFlowClickNodeCapacityOption(){
        workFlow.clickNodeCapacityOption();
    }

    @And("^Select resource pool option$")
    public void workFlowClickResourcePool(){
        workFlow.clickResourcePool();
    }

    @And("^Select button add$")
    public void workFlowClickButtonAdd(){
        workFlow.clickButtonAdd();
    }

    @And("^Capture start date (.+) of the camp$")
    public void workFlowInputEffectiveStartDate(String startDate){
        workFlow.inputEffectiveStartDate(startDate);
    }

    @And("^Capture end date (.+) of the camp$")
    public void workFlowInputEffectiveEndDate(String endDate){
        workFlow.inputEffectiveEndDate(endDate);
    }

    @And("^Select button save$")
    public void workFlowClickButtonSave(){
        workFlow.clickButtonSave();
    }

    @And("^Click on the checkbox capacity period$")
    public void workFlowCheckStandardCapacityPeriod(){
        workFlow.checkStandardCapacityPeriod();
    }

    @And("^Capture Sunday amount (.+) of the camp$")
    public void workFlowInputSundayCapacity(String sunday){
        workFlow.inputSundayCapacity(sunday);
    }

    @And("^Capture Monday amount (.+) of the camp$")
    public void workFlowInputMondayCapacity(String monday){
        workFlow.inputMondayCapacity(monday);
    }

    @And("^Capture Tuesday amount (.+) of the camp$")
    public void workFlowInputTuesdayCapacity(String tuesday){
        workFlow.inputTuesdayCapacity(tuesday);
    }

    @And("^Capture Wednesday amount (.+) of the camp$")
    public void workFlowInputWednesdayCapacity(String wednesday){
        workFlow.inputWednesdayCapacity(wednesday);
    }

    @And("^Capture Thursday amount (.+) of the camp$")
    public void workFlowInputThursdayCapacity(String thursday){
        workFlow.inputThursdayCapacity(thursday);
    }

    @And("^Capture Friday amount (.+) of the camp$")
    public void workFlowInputFridayCapacity(String friday){
        workFlow.inputFridayCapacity(friday);
    }

    @And("^Capture Saturday amount (.+) of the camp$")
    public void workFlowInputSaturdayCapacity(String saturday){
        workFlow.inputSaturdayCapacity(saturday);
    }

    @And("^Click on the button save$")
    public void workFlowClickButtonSaveCapacity(){
        workFlow.clickButtonSaveCapacity();
    }
}