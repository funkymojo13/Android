package test.dataClasses;

import org.codehaus.jackson.annotate.JsonProperty;

public class Wrapper {
	public BaseDataSet baseDataSet;

	@JsonProperty("basedataset")
	public BaseDataSet getBaseDataSet() {
		return baseDataSet;
	}

	@JsonProperty("basedataset")
	public void setBaseDataSet(BaseDataSet baseDataSet) {
		this.baseDataSet = baseDataSet;
	}
	
	public void print() {
		baseDataSet.print();
	}
}
