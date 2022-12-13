/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05063_TongDaThuc;

/**
 *
 * @author :Tran Quang Huy
 */
public class DaThuc {
    private int[] d;
    
    public DaThuc(String s) {
        this.d = new int[10001];
        for(String x : s.split("\\s\\+\\s")){
                String[] arr = x.split("[\\*\\^]");
            d[Integer.parseInt(arr[arr.length - 1])] = Integer.parseInt(arr[0]);
            
        }
    }
        

    public DaThuc(int[] d) {
        this.d = d;
    }

    public DaThuc() {
        this.d = new int[10001];
    }
    
    public DaThuc cong(DaThuc o){
        DaThuc r = new DaThuc();
        for(int i = 0; i <= 10000; i++){
            r.d[i] = this.d[i] + o.d[i];
        }
        return r;
    }
    public String toString(){
        StringBuilder res = new StringBuilder();
        for(int i = 10000; i >= 0; i--){
            if(this.d[i] != 0){
                res.append(String.format("%d*x^%d + ", this.d[i], i));
            }
        }
        res.delete(res.length() - 3, res.length());
        return res.toString();
    }
}
