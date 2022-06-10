package imagens;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JButton;

public class SVGImage extends JButton{
    
    private FlatSVGIcon svgIcon;
    public void setSVGImage(String image, int width, int height){
        svgIcon = new FlatSVGIcon(image, width, height);
        setIcon(svgIcon);
    }
}
