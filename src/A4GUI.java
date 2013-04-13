public class A4GUI extends a4GUI.ComparisonGUI{
	public Species[] species; //array of Species objects
	public int[][] distMatrix; //species distance matrix

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	/** An instance for n species. n > 0. */
	public A4GUI(int n){
		super(n);
	}
	
	public A4GUI(Species[] species, int[][] distMatrix){
		super(species.length);
		this.species=species;
		this.distMatrix=distMatrix;
		for (int i=0;i<species.length;i++)
		super.setCellImage(i,"SpeciesData/"+species[i].getImageFilename());
	}
	
	
	 /** Add to field comparisonBox the stuff that goes into the right panel, i.e.
    the label and image for the selected species and the label and image for
    its closest species. */
	@Override
	public void fixComparisonBox(){
		super.comparisonBox.add(super.selectedLabel);
		super.comparisonBox.add(super.selectedImage);
		super.comparisonBox.add(super.closestRelatedLabel);
		super.comparisonBox.add(super.closestRelatedImage);
	}

}
