package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
    private float height;
    private float weight;
    private float index;

    public BodyMassIndex(float height, float weight) {
        this.height = height;
        this.weight = weight;
        this.calculate();
    }

    private float calculate() {
        return this.index = this.weight / (this.height*this.height);
    }

    public String ideal(){
        String klasifikasi ="";
        if(this.index < 18.50){
            klasifikasi = "Underweight";
        } else if(this.index >= 18.50 && this.index <= 24.99){
            klasifikasi = "Healthy Weight";
        } else if(this.index >= 25 && this.index <= 39.99){
            klasifikasi = "Pre-obese";
        } else if(this.index >= 30 && this.index <= 34.99){
            klasifikasi = "Obese Class 1";
        } else if(this.index >= 40 && this.index <= 39.99){
            klasifikasi = "Obase Class 2";
        } else if(this.index >= 40){
            klasifikasi = "Obese Class 3";
        }
        return klasifikasi;
    }

}
