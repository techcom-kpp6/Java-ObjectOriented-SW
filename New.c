void setup()  
{
    //red 512
    //green 341
    //blue 170
}
int i = 1;
void loop()
{
    int l = analog(1);
    int r = analog(3);
    int f = analog(8);
    lcd("%d %d", f, l);
    
    if(f == 0){   
        fd(50);
        
    }else if(f > 140 & f < 200){
        fd(50);
            if(l > 140 & l < 200){
                    fd(0);
                    sleep(100);   
                }
            }else if(f > 311 & f < 371){
            fd(50);
            if(l > 311 & l < 371){
                    fd(0);
                    sleep(100);   
                }
            }else if(f > 482 & f < 542){
            fd(50);
            if(l > 482 & l < 542){
                    fd(0);
                    sleep(100);   
                }
            } 
          

    
}