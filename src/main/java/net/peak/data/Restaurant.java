package net.peak.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "restaurants")
@JsonIgnoreProperties(value = {"inspectionDate", "violationCode", "violationDescription",
        "criticalFlag", "score", "gradeDate", "recordDate", "inspectionType",
        "communityBoard", "councilDistrict", "censusTract", "bin", "bbl", "nta"})
@ApiModel(description = "Details about the Restaurants")
public class Restaurant {

    @Id
    @Column(name = "CAMIS")
    private int camis;

    @Column(name = "DBA")
    private String restaurantName;

    @Column(name = "BORO")
    private String borough;

    @Column(name = "BUILDING")
    private String building;

    @Column(name = "STREET")
    private String street;

    @Column(name = "ZIPCODE")
    private String zipcode;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "CUISINE_DESCRIPTION")
    private String cuisineDescription;

    @Column(name = "INSPECTION_DATE")
    private Date inspectionDate;

    @Column(name = "VIOLATION_CODE")
    private String violationCode;

    @Column(name = "VIOLATION_DESCRIPTION")
    private String violationDescription;

    @Column(name = "CRITICAL_FLAG")
    private String criticalFlag;

    @Column(name = "SCORE")
    private int score;

    @Column(name = "GRADE")
    private String grade;

    @Column(name = "GRADE_DATE")
    private Date gradeDate;

    @Column(name = "RECORD_DATE")
    private Date recordDate;

    @Column(name = "INSPECTION_TYPE")
    private String inspectionType;

    @Column(name = "Latitude")
    private float latitude;

    @Column(name = "Longitude")
    private float longitude;

    @Column(name = "Community_Board")
    private int communityBoard;

    @Column(name = "Council_District")
    private int councilDistrict;

    @Column(name = "Census_Tract")
    private int censusTract;

    @Column(name = "BIN")
    private int bin;

    @Column(name = "BBL")
    private int bbl;

    @Column(name = "NTA")
    private String nta;

}
