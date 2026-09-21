import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Main extends JPanel {

    public Main() {
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // Smooth drawing
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        // Colors
        Color gold = new Color(255, 190, 50);
        Color white = Color.WHITE;
        Color orange = new Color(255, 120, 20);

        g2.setStroke(new BasicStroke(5));

        // =====================================
        // CROWN
        // =====================================

        g2.setColor(gold);

        Path2D crown = new Path2D.Double();

        crown.moveTo(300, 170);
        crown.lineTo(330, 80);
        crown.lineTo(370, 125);
        crown.lineTo(400, 60);
        crown.lineTo(430, 125);
        crown.lineTo(470, 80);
        crown.lineTo(500, 170);
        crown.closePath();

        g2.draw(crown);

        // Crown decorations
        g2.drawOval(385, 85, 30, 30);
        g2.drawOval(330, 115, 25, 25);
        g2.drawOval(445, 115, 25, 25);


        // =====================================
        // LEFT EAR
        // =====================================

        g2.setColor(gold);

        Path2D leftEar = new Path2D.Double();

        leftEar.moveTo(320, 190);
        leftEar.curveTo(260, 140, 190, 170, 190, 240);
        leftEar.curveTo(190, 310, 250, 335, 315, 295);

        g2.draw(leftEar);

        // Inner ear
        g2.setColor(white);

        Path2D leftInner = new Path2D.Double();

        leftInner.moveTo(285, 205);
        leftInner.curveTo(245, 185, 220, 215, 225, 250);
        leftInner.curveTo(230, 280, 255, 295, 280, 275);

        g2.draw(leftInner);


        // =====================================
        // RIGHT EAR
        // =====================================

        g2.setColor(gold);

        Path2D rightEar = new Path2D.Double();

        rightEar.moveTo(480, 190);
        rightEar.curveTo(540, 140, 610, 170, 610, 240);
        rightEar.curveTo(610, 310, 550, 335, 485, 295);

        g2.draw(rightEar);

        // Inner ear
        g2.setColor(white);

        Path2D rightInner = new Path2D.Double();

        rightInner.moveTo(515, 205);
        rightInner.curveTo(555, 185, 580, 215, 575, 250);
        rightInner.curveTo(570, 280, 545, 295, 520, 275);

        g2.draw(rightInner);


        // =====================================
        // FACE
        // =====================================

        g2.setColor(gold);

        Path2D face = new Path2D.Double();

        face.moveTo(315, 180);

        face.curveTo(340, 140, 460, 140, 485, 180);

        face.curveTo(520, 230, 500, 300, 460, 330);

        face.curveTo(425, 355, 375, 355, 340, 330);

        face.curveTo(300, 300, 280, 230, 315, 180);

        g2.draw(face);


        // =====================================
        // EYES
        // =====================================

        g2.setColor(white);
        g2.setStroke(new BasicStroke(6));

        Path2D eye1 = new Path2D.Double();

        eye1.moveTo(325, 230);
        eye1.curveTo(345, 210, 370, 210, 385, 230);

        g2.draw(eye1);


        Path2D eye2 = new Path2D.Double();

        eye2.moveTo(415, 230);
        eye2.curveTo(430, 210, 455, 210, 475, 230);

        g2.draw(eye2);


        // Pupils
        g2.setColor(gold);

        g2.fillOval(350, 225, 12, 12);
        g2.fillOval(438, 225, 12, 12);


        // =====================================
        // TILAK
        // =====================================

        g2.setColor(orange);

        g2.fillOval(392, 175, 16, 45);


        // =====================================
        // TRUNK
        // =====================================

        g2.setColor(gold);
        g2.setStroke(new BasicStroke(8));

        Path2D trunk = new Path2D.Double();

        trunk.moveTo(400, 260);

        trunk.curveTo(370, 300, 360, 350, 390, 380);

        trunk.curveTo(420, 410, 475, 395, 470, 355);

        trunk.curveTo(465, 330, 440, 330, 430, 350);

        trunk.curveTo(425, 360, 440, 370, 450, 365);

        g2.draw(trunk);


        // =====================================
        // BODY
        // =====================================

        g2.setColor(gold);
        g2.setStroke(new BasicStroke(7));

        Path2D body = new Path2D.Double();

        body.moveTo(325, 340);

        body.curveTo(270, 390, 255, 470, 275, 540);

        body.curveTo(295, 610, 350, 640, 400, 640);

        body.curveTo(450, 640, 505, 610, 525, 540);

        body.curveTo(545, 470, 530, 390, 475, 340);

        g2.draw(body);


        // =====================================
        // BELLY
        // =====================================

        g2.setColor(white);
        g2.setStroke(new BasicStroke(4));

        g2.drawOval(330, 420, 140, 160);


        // =====================================
        // LEFT ARM
        // =====================================

        g2.setColor(gold);
        g2.setStroke(new BasicStroke(7));

        Path2D leftArm = new Path2D.Double();

        leftArm.moveTo(320, 390);

        leftArm.curveTo(275, 400, 230, 435, 205, 475);

        leftArm.curveTo(195, 495, 215, 510, 235, 495);

        leftArm.curveTo(265, 475, 280, 450, 320, 435);

        g2.draw(leftArm);


        // =====================================
        // RIGHT ARM
        // =====================================

        Path2D rightArm = new Path2D.Double();

        rightArm.moveTo(480, 390);

        rightArm.curveTo(525, 400, 570, 435, 595, 475);

        rightArm.curveTo(605, 495, 585, 510, 565, 495);

        rightArm.curveTo(535, 475, 520, 450, 480, 435);

        g2.draw(rightArm);


        // =====================================
        // NECKLACE
        // =====================================

        g2.setColor(white);
        g2.setStroke(new BasicStroke(4));

        g2.drawArc(320, 340, 160, 80, 180, 180);


        // Necklace beads
        g2.setColor(gold);

        for (int i = 0; i < 7; i++) {

            int x = 335 + i * 22;

            g2.fillOval(x, 375, 12, 12);
        }


        // =====================================
        // LEGS
        // =====================================

        g2.setColor(gold);
        g2.setStroke(new BasicStroke(7));

        // Left leg
        Path2D leftLeg = new Path2D.Double();

        leftLeg.moveTo(360, 550);

        leftLeg.curveTo(320, 570, 275, 600, 250, 630);

        leftLeg.curveTo(290, 650, 345, 640, 390, 610);

        g2.draw(leftLeg);


        // Right leg
        Path2D rightLeg = new Path2D.Double();

        rightLeg.moveTo(440, 550);

        rightLeg.curveTo(480, 570, 525, 600, 550, 630);

        rightLeg.curveTo(510, 650, 455, 640, 410, 610);

        g2.draw(rightLeg);


        // =====================================
        // LOTUS
        // =====================================

        g2.setColor(gold);
        g2.setStroke(new BasicStroke(4));

        g2.drawOval(300, 625, 200, 45);

        g2.drawArc(315, 610, 70, 60, 20, 120);
        g2.drawArc(415, 610, 70, 60, 40, 120);


        // =====================================
        // DECORATIVE SPARKLES
        // =====================================

        drawSparkle(g2, 140, 200);
        drawSparkle(g2, 660, 200);
        drawSparkle(g2, 150, 550);
        drawSparkle(g2, 650, 550);


        // =====================================
        // TEXT
        // =====================================

        g2.setColor(gold);

        g2.setFont(new Font("Serif", Font.BOLD, 25));

        String text = "GANPATI BAPPA MORYA";

        int width = g2.getFontMetrics().stringWidth(text);

        g2.drawString(text, 400 - width / 2, 730);
    }


    // Sparkle method
    public void drawSparkle(Graphics2D g2, int x, int y) {

        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(3));

        g2.drawLine(x - 15, y, x + 15, y);
        g2.drawLine(x, y - 15, x, y + 15);

        g2.drawLine(x - 10, y - 10, x + 10, y + 10);
        g2.drawLine(x + 10, y - 10, x - 10, y + 10);
    }


    // =====================================
    // MAIN
    // =====================================

    public static void main(String[] args) {

        JFrame frame = new JFrame("Lord Ganesha - Java Art");

        Main panel = new Main();

        frame.add(panel);

        frame.setSize(800, 800);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}