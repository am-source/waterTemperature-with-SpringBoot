package com.amsource.waterTemperatureDemo.Service.Helper;

import java.sql.Timestamp;

public class LoraPark_API_Helper {

  private static final String BASE_URI =
      "https://datenhub.ulm.de/api/v1/datasets/lorapark_wassertemperatur/resources/lorapark_wassertemperatur?";

  private String URI;

  private String rando = "offset=0&limit=3&where=1=1 order by timestamp desc";

  public LoraPark_API_Helper() {
    this.URI = BASE_URI;
  }

  public void setLimitRecordsTo(int maxRecordAmount) {
    handleBaseUriExtension();
    this.URI += String.format("limit=%o", maxRecordAmount);
  }

  public void setOffsetRecordsTo(int skippedRecordsAmount) {
    handleBaseUriExtension();
    this.URI += String.format("offset=%o", skippedRecordsAmount);
  }

  public void setOrderingToASC() {
    handleBaseUriExtension();
    this.URI += "where=1=1 order by timestamp asc";
  }

  public void setOrderingToDESC() {
    handleBaseUriExtension();
    this.URI += "where=1=1 order by timestamp desc";
  }

  public void setTimestampLowerThan(Timestamp date) {
    // e.g. '2023-01-07 00:06:27'
    handleBaseUriExtension();
    this.URI += String.format("where=timestamp < '%s'", date.toString());
  }

  public void setTimestampGreaterThan(Timestamp date) {
    // e.g. '2023-01-07 00:06:27'
    handleBaseUriExtension();
    this.URI += String.format("where=timestamp > '%s'", date.toString());
  }

  public void setCustomWhereSqlClause(String customSQL) {
    // e.g. "where=YEAR(timestamp) = '2022'"
    handleBaseUriExtension();
    this.URI += customSQL;
  }

  private void handleBaseUriExtension() {
    if (uriHasBeenExtended()) {
      this.URI += "&";
    }
  }

  private boolean uriHasBeenExtended() {
    // if URI has been changed from BASE_URI, then we need to add "&" before adding another option
    return !this.URI.equals(BASE_URI);
  }
}
