public class Billing {
	private float photobookprice=0;
	private int photobooks = 1;
	private final int taxpercent = 8;
	private float couponValuePercent=0;
	private float totalDue=0;
	public Billing(float photobookprice) {
		this.photobookprice = photobookprice;
		totalDue = calculateOneBookPrice();
	}

	public Billing(float photobookprice, int photobooks) {
		this(photobookprice);
		this.photobooks = photobooks;
		totalDue = calculateBooksPrice();  
	}

	public Billing(float photobookprice, int photobooks, float couponValuePercent) {
		this(photobookprice, photobooks);
		this.couponValuePercent = couponValuePercent;
		totalDue = calculateBooksPriceWithCoupon();
	}

	private float calculateOneBookPrice() {
		return photobookprice + (0.08f * photobookprice);
	}
	
	private float calculateBooksPrice() {
		return calculateOneBookPrice() * photobooks;
	}
	
	private float calculateBooksPriceWithCoupon() {
		return  (calculateOneBookPrice() * photobooks) - couponValuePercent;
	}
	public static void main(String[] args) {
		
		Billing bill1 = new Billing(175);
		Billing bill2 = new Billing(175,5);
		Billing bill3 = new Billing(175,7,5.0f);
		
		
		System.out.println("Billing 1");
		System.out.println(bill1.toString());
		System.out.println("Billing 2");
		System.out.println(bill2.toString());
		System.out.println("Billing 3");
		System.out.println(bill3.toString());
		
	}
	public float getTotalDue() {
		return totalDue;
	}
	
	public float getPhotobookprice() {
		return photobookprice;
	}

	public void setPhotobookprice(float photobookprice) {
		this.photobookprice = photobookprice;
	}

	public int getPhotobooks() {
		return photobooks;
	}

	public void setPhotobooks(int photobooks) {
		this.photobooks = photobooks;
	}

	public float getCouponValuePercent() {
		return couponValuePercent;
	}

	public void setCouponValuePercent(float couponValuePercent) {
		this.couponValuePercent = couponValuePercent;
	}

	public int getTaxpercent() {
		return taxpercent;
	}
	public String toString() {
		return "Billing [photobookprice=" + photobookprice + ", photobooks="
				+ photobooks + ", taxpercent=" + taxpercent
				+ ", couponValuePercent=" + couponValuePercent + ", totalDue="
				+ totalDue + "]";
	}
}