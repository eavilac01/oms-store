package page;

import webElements.WebElements;

public class WorkFlowPage extends LogicOrganizationPage {

    public WorkFlowPage() {
        super(driver);
    }

    public void inputHubOrganization(String organization) {
        insertHubOrganizationAndSelect(WebElements.hubOrganization, organization);
    }

    public void clickInventoryOption() {
        clickInventoryOption(WebElements.inventoryOption);
    }

    public void clickNodeCapacityOption() {
        clickNodeCapacityOption(WebElements.nodeCapacityOption);
    }

    public void clickResourcePool() {
        clickResourcePool(WebElements.resourcePool);
    }

    public void clickButtonAdd() {
        clickButtonAdd(WebElements.buttonAdd);
    }

    public void inputEffectiveStartDate(String date) {
        insertEffectiveStartDate(WebElements.effectiveStartDate, date);
    }

    public void inputEffectiveEndDate(String date) {
        insertEffectiveEndDate(WebElements.effectiveEndDate, date);
    }

    public void clickButtonSave() {
        clickButtonSave(WebElements.buttonSave);
    }

    public void checkStandardCapacityPeriod() {
        checkStandardCapacityPeriod(WebElements.checkStandardCapacityPeriod);
    }

    public void inputSundayCapacity(String capacity) {
        insertSundayCapacity(WebElements.sundayCapacity, capacity);
    }

    public void inputMondayCapacity(String capacity) {
        insertMondayCapacity(WebElements.mondayCapacity, capacity);
    }

    public void inputTuesdayCapacity(String capacity) {
        insertTuesdayCapacity(WebElements.tuesdayCapacity, capacity);
    }

    public void inputWednesdayCapacity(String capacity) {
        insertWednesdayCapacity(WebElements.wednesdayCapacity, capacity);
    }

    public void inputThursdayCapacity(String capacity) {
        insertThursdayCapacity(WebElements.thursdayCapacity, capacity);
    }

    public void inputFridayCapacity(String capacity) {
        insertFridayCapacity(WebElements.fridayCapacity, capacity);
    }

    public void inputSaturdayCapacity(String capacity) {
        insertSaturdayCapacity(WebElements.saturdayCapacity, capacity);
    }

    public void clickButtonSaveCapacity() {
        clickButtonSaveCapacity(WebElements.buttonSaveCapacity);
    }
}