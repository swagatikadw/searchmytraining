package com.searchmytraining.dto;

import java.sql.Timestamp;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.searchmytraining.common.constant.CalenderType;

public class TrainingProviderCalenderDTO {
	
	@NotNull(message="Please enter course Title")     
	private String courseTitle;
	
	private CalenderType calenderType;
	
	private int industryId;
	
	private Double price;
	
	private boolean saveDraft;
	
	private boolean showPrice;
	
	@NotNull(message="Please enter a valid date")     
	@Future (message="Only the Future is valid")     
	private Timestamp fromDate;
	
	@NotNull(message="Please enter a valid date")     
	@Future (message="Only the Future is valid")     
	private Timestamp toDate;

	@NotNull(message="Please enter a valid time")     
	private String time;
	
	@NotEmpty(message="Please enter a valid address")
	@Size(min=5, max=500,message="Name length Must be between {min} to {max}")
	private String addressLine1;
	
	private String addressLine2;
	
	@NotEmpty(message="Please enter a valid landmark")
	@Size(min=10, max=200,message="Name length Must be between {min} to {max}")
	private String landmark;
	
	private int city;
	
	private int state;
	
	private int country;
	
	private int pincode;
	
	@NotEmpty(message="Please enter a valid Quick View")
	@Size(min=10, max=1000,message="Quick View length Must be between {min} to {max}")
	private String trngQuickView;
	
	@NotEmpty(message="Please enter a valid Training Overview")
	@Size(min=10, max=2000,message="Training Overview length Must be between {min} to {max}")
	private String trngOverView;
	
	@NotEmpty(message="Please enter a Description For training")
	@Size(min=10, max=1000,message="Description For training Must be between {min} to {max}")
	private String trngTakeAway;
	
	@NotEmpty(message="Please enter a Description For training Methodology")
	@Size(min=10, max=1000,message="training Methodology Must be between {min} to {max}")
	private String trngMethodology;
	
	@NotEmpty(message="Please enter a Description For training Attandant")
	@Size(min=10, max=500,message="training Attandant Must be between {min} to {max}")
	private String trngAttandant;
	
	@NotEmpty(message="Please enter a valid Key")
	@Size(min=2, max=200,message="valid Keylength must be between {min} to {max}")
	private String trainingKey;
	
	@NotEmpty(message="Please enter valid faculty details")
	@Size(min=10, max=1000,message="faculty Details length Must be between {min} to {max}")
	private String facultyDetails;
	
	@NotEmpty(message="Please enter a valid description")
	@Size(min=10, max=2000,message="Registration Details length Must be between {min} to {max}")
	private String howtoregister;
	
	@NotEmpty(message="Please enter a valid Training Provider")
	@Size(min=10, max=1000,message="Training Provider details Must be between {min} to {max}")
	private String detailsOfProvider;

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public CalenderType getCalenderType() {
		return calenderType;
	}

	public void setCalenderType(CalenderType calenderType) {
		this.calenderType = calenderType;
	}

	public int getIndustryId() {
		return industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isSaveDraft() {
		return saveDraft;
	}

	public void setSaveDraft(boolean saveDraft) {
		this.saveDraft = saveDraft;
	}

	public boolean isShowPrice() {
		return showPrice;
	}

	public void setShowPrice(boolean showPrice) {
		this.showPrice = showPrice;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getTrngQuickView() {
		return trngQuickView;
	}

	public void setTrngQuickView(String trngQuickView) {
		this.trngQuickView = trngQuickView;
	}

	public String getTrngOverView() {
		return trngOverView;
	}

	public void setTrngOverView(String trngOverView) {
		this.trngOverView = trngOverView;
	}

	public String getTrngTakeAway() {
		return trngTakeAway;
	}

	public void setTrngTakeAway(String trngTakeAway) {
		this.trngTakeAway = trngTakeAway;
	}

	public String getTrngMethodology() {
		return trngMethodology;
	}

	public void setTrngMethodology(String trngMethodology) {
		this.trngMethodology = trngMethodology;
	}

	public String getTrngAttandant() {
		return trngAttandant;
	}

	public void setTrngAttandant(String trngAttandant) {
		this.trngAttandant = trngAttandant;
	}

	public String getTrainingKey() {
		return trainingKey;
	}

	public void setTrainingKey(String trainingKey) {
		this.trainingKey = trainingKey;
	}

	public String getFacultyDetails() {
		return facultyDetails;
	}

	public void setFacultyDetails(String facultyDetails) {
		this.facultyDetails = facultyDetails;
	}

	public String getHowtoregister() {
		return howtoregister;
	}

	public void setHowtoregister(String howtoregister) {
		this.howtoregister = howtoregister;
	}

	public String getDetailsOfProvider() {
		return detailsOfProvider;
	}

	public void setDetailsOfProvider(String detailsOfProvider) {
		this.detailsOfProvider = detailsOfProvider;
	}

	public Timestamp getFromDate() {
		return fromDate;
	}

	public void setFromDate(Timestamp fromDate) {
		this.fromDate = fromDate;
	}

	public Timestamp getToDate() {
		return toDate;
	}

	public void setToDate(Timestamp toDate) {
		this.toDate = toDate;
	}
	
}