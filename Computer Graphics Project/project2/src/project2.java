import java.awt.*;
import java.applet.*;
import java.awt.geom.*;

public class project2 extends Applet {

	public void init() {
	}

	public void paint(Graphics g) {

//surface


		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.black);

		GeneralPath p = new GeneralPath();
		GeneralPath q = new GeneralPath();
		GeneralPath p1 = new GeneralPath();
		GeneralPath q1 = new GeneralPath();
		GeneralPath q2= new GeneralPath();
		GeneralPath q3= new GeneralPath();
		GeneralPath q4= new GeneralPath();
		GeneralPath q7= new GeneralPath();
		GeneralPath q8= new GeneralPath();
		GeneralPath q9= new GeneralPath();
		GeneralPath q10= new GeneralPath();
		GeneralPath q11= new GeneralPath();
		GeneralPath q14= new GeneralPath();
		GeneralPath q17= new GeneralPath();
		GeneralPath q18= new GeneralPath();


/////Mared
	p.moveTo(700,700);
		//half right body
		p.curveTo(700,700,700,570,800,570);//head left
		p.curveTo(800,570,900,570,900,700);//head right
		p.curveTo(900,700,1030,780,900,800);//outer right arm
		p.lineTo(900,830);//outer right hand
		p.curveTo(900,830,870,800,885,790);//inner right hand
		p.curveTo(885,790,1000,780,900,715);//inner right arm
		p.curveTo(900,715,915,790,850,810);//right waist
		p.curveTo(850,810,870,850,850,910);//outer right leg
	//right foot
		p.lineTo(880,910);
		p.lineTo(880,940);
		p.lineTo(830,940);
		p.curveTo(830,940,820,930,830,910);//foot curve right
		//inner right leg
		p.curveTo(830,910,850,850,830,810);
		//merge curve
		p.curveTo(830,810,800,815,770,810);
	//half left body
		p.curveTo(770,810,750,850,770,910);	//inner left leg
		p.curveTo(770,910,780,930,770,940);//foot curve left
		//left foot
		p.lineTo(720,940);
		p.lineTo(720,910);
		p.lineTo(750,910);
		p.curveTo(750,910,730,850,750,810);//outer left leg
		p.curveTo(750,810,685,790,700,715);//left waist
		p.curveTo(700,715,600,780,715,790);//inner left arm
		p.curveTo(715,790,730,800,700,830);//inner left hand
		p.lineTo(700,800);   //outer left hand
		p.curveTo(700,800,570,780,700,700); //outer right arm
		p.closePath();
		g2.setStroke(new BasicStroke(4.0f));
		g2.setColor(Color.black);
		g2.draw(p);
		g2.setColor(Color.green);
		g2.fill(p);
		
		//eyes
		Ellipse2D eye1 = new Ellipse2D.Double(745,610,110,120);
		g2.setStroke(new BasicStroke(4.0f));
		g2.setColor(Color.black);
		g2.draw(eye1);
		g2.setColor(Color.white);
		g2.fill(eye1);
		
		Ellipse2D eye2 = new Ellipse2D.Double(774,640,55,62);
		g2.setColor(Color.black);
		g2.draw(eye2);
		g2.setColor(Color.blue);
		g2.fill(eye2);
		
		Ellipse2D eye3 = new Ellipse2D.Double(784,650,35,42);
		g2.setColor(Color.black);
		g2.fill(eye3);
	
		//eyebrows
		QuadCurve2D eyebrow = new QuadCurve2D.Double(760,590,796,570,840,605);
		g2.setStroke(new BasicStroke(2.0f));
		g2.setColor(Color.black);
		g2.draw(eyebrow);
		
		QuadCurve2D mouth_line = new QuadCurve2D.Double(875,740,870,760,840,775);
		g2.draw(mouth_line);
		
		//Mouth
		GeneralPath p2 = new GeneralPath();
		p2.moveTo(750,750);
		p2.curveTo(750,740,855,820,875,685);
		p2.curveTo(870,685,865,745,750,750);
		p2.closePath();
		Color c1 = new Color(0,150,0);
		g2.setColor(c1);
		g2.fill(p2);
		g2.setStroke(new BasicStroke(2.5f));
		g2.setColor(Color.black);
		g2.draw(p2);
			
		//teeth
		int r [] = {765,790,795};
		int z [] = {748,760,744};
		g2.setColor(Color.black);
		g2.drawPolygon(r,z,3);


		int x2[] = {795,815,830};
		int y2[] = {744,759,735};
		g2.drawPolygon(x2,y2,3);

		int x3[] = {830,850,865};
		int y3[] = {735,740,705};
		g2.drawPolygon(x3,y3,3);

		g2.setColor(Color.WHITE);
		g2.fillPolygon(r,z,3);
		g2.fillPolygon(x2,y2,3);
		g2.fillPolygon(x3,y3,3);

		//mouth outline
		GeneralPath p3= new GeneralPath();
		p3.moveTo(750,750);
		p3.curveTo(750,740,855,820,875,685);
		p3.curveTo(870,685,865,745,750,750);
		p3.closePath();
		g2.setColor(Color.black);
		g2.draw(p3);
		
		//checks
		g2.setColor(Color.PINK);
		g.fillOval(877,685,20,15);
		g.fillOval(703,685,20,15);
		
		//corns
		QuadCurve2D c_left = new QuadCurve2D.Double(712,630,690,580,730,600);
		g2.setColor(Color.BLACK);
		g2.draw(c_left);
		QuadCurve2D c_right = new QuadCurve2D.Double(887,630,910,580,870,600);
		g2.setColor(Color.BLACK);
		g2.draw(c_right);
		
		//shose
		Arc2D a1 = new Arc2D.Double(687,910,62,62,90,90,Arc2D.PIE);
		g2.draw(a1);
		Arc2D a2 = new Arc2D.Double(851,910,62,62,0,90,Arc2D.PIE);
		g2.draw(a2);
		
		//nails
		Arc2D a3 = new Arc2D.Double(889,775,20,55,270,95,Arc2D.PIE);
		g2.draw(a3);
		Arc2D a4 = new Arc2D.Double(688,775,20,55,175,90,Arc2D.PIE);
		g2.draw(a4);

		/*********************************/
//Shalaby

		int x= 250;
		int y = 360;
		int m [] = {40+x,-20+x,-66+x,-60+x,-50+x,-10+x,30+x,50+x,130+x,230+x,250+x,250+x,250+x,310+x,300+x,310+x,300+x,280+x,250+x,300+x,300+x,255+x,200+x};
		int n [] = {220+y,340+y,505+y,540+y,580+y,560+y,580+y,570+y,520+y,580+y,520+y,300+y,580+y,580+y,490+y,560+y,500+y,260+y,200+y,560+y,404+y,210+y,160+y};
		g.setColor(new Color(78,182,208));
		g2.fillPolygon(m,n,21);
		Ellipse2D e5 = new Ellipse2D.Double(190+x,240+y,60,160);
		g2.fill(e5);
		Ellipse2D e6 = new Ellipse2D.Double(212+x,500+y,55,80);
		g2.fill(e6); 	
		g.setColor(Color.black);
		
	//hair
		q.moveTo(95+x,100+y);
		q.curveTo(95+x,100+y, 120+x,90+y, 140+x,50+y);
		q.curveTo(140+x,50+y, 150+x,70+y, 137+x,90+y);
		q.curveTo(137+x,90+y, 160+x,70+y, 165+x,50+y);
		q.curveTo(165+x,50+y, 178+x,60+y, 180+x,90+y);
		q.lineTo(200+x,60+y);
		q.curveTo(200+x,60+y, 210+x,90+y, 190+x,100+y);
		
	//right ear
		q17.moveTo(190+x,100+y);
		q17.curveTo(190+x,100+y, 230+x,80+y, 235+x,65+y);
		q17.curveTo(235+x,65+y, 250+x,90+y, 200+x,110+y);
		g2.draw(q17);

	//left ear
		q18.moveTo(60+x,110+y);
		q18.curveTo(60+x,110+y, 10+x,100+y, 30+x,60+y);
		q18.curveTo(30+x,60+y, 30+x,80+y, 60+x,100+y);
		g2.draw(q18);

	//stomach
		g.setColor(Color.black);
		q7.moveTo(210+x,250+y);
		q7.curveTo(210+x,250+y,250+x,480+y,140+x,490+y);
		q7.curveTo(150+x,490+y,-20+x,490+y,50+x,250+y);
		g2.draw(q7);
		g.setColor(new Color(163,213,216));
		g2.fill(q7);



 //face

	//two curves for right side
		q.curveTo(200+x,110+y, 220+x,120+y, 200+x,160+y);
		q.curveTo(200+x,160+y, 270+x,270+y, 130+x,300+y);

	//chin
		g.setColor(Color.black);
		q.lineTo(130+x,315+y);
		q.lineTo(125+x,300+y);
		q.lineTo(120+x,315+y);
		q.lineTo(110+x,290+y);

	//two curves for left side
		q.curveTo(x+110,290+y, 0+x,270+y, 60+x,160+y);
		q.curveTo(60+x,160+y, 40+x,120+y, 60+x,110+y);

	//brow curve
		q.curveTo(60+x,100+y, 70+x,90+y, 95+x,100+y);
		q.closePath();
		g2.draw(q);
		g.setColor(new Color(78,182,208));
		g2.fill(q);


 //hand

	//hair of the right body
		p1.moveTo(200+x,160+y);
		p1.curveTo(200+x,160+y, 250+x,175+y, 240+x,180+y);
		p1.lineTo(220+x,180+y);

	    p1.curveTo(220+x,180+y, 240+x,180+y, 260+x,200+y);
	    p1.lineTo(250+x,200+y);

		p1.lineTo(270+x,210+y);
		p1.lineTo(255+x,210+y);
		g.setColor(Color.black);

    //right shoulder

	    p1.curveTo(255+x,210+y, 300+x,220+y, 315+x,300+y);
	    p1.curveTo(315+x,300+y, 330+x,400+y, 330+x,500+y);

		g.setColor(new Color(78,182,208));
		g2.fill(p1);
		g.setColor(Color.black);

	//left hand
		q1.moveTo(60+x,160+y);
		q1.curveTo(60+x,160+y, 10+x,175+y, 20+x,180+y);

		q1.lineTo(40+x,180+y);
		q1.curveTo(40+x,180+y, 20+x,180+y, 0+x,200+y);
		q1.lineTo(10+x,200+y);
		q1.lineTo(-10+x,210+y);
		q1.lineTo(5+x, 210+y);
	    g.setColor(new Color(78,182,208));
		g2.fill(q1);
	//left leg
		q4.moveTo(-70+x,505+y);
		q4.curveTo(-70+x,505+y,-80+x,540+y,-50+x,560+y);
		q4.lineTo(-10+x,560+y);
		q4.lineTo(-50+x,560+y);
		q4.curveTo(-50+x,560+y,-95+x,565+y,-100+x,580+y);
		q4.lineTo(30+x,580+y);
		g.setColor(new Color(78,182,208));
		g2.fill(q4);
		g.setColor(Color.black);
		g2.draw(q4);
	//left shoulder
		g.setColor(new Color(78,182,208));
		g2.fill(q1);

	    q1.curveTo(5+x,210+y, -40+x,230+y, -55+x,300+y);
	    q1.curveTo(-55+x,300+y, -90+x,400+y, -90+x,500+y);
	    g.setColor(Color.black);
    //left pink ellipse
  	    g.setColor(new Color(204,135,255));
		Ellipse2D e7 = new Ellipse2D.Double(-70+x,450+y,55,80);
		g2.fill(e7);


    //left tofingures
	    q1.lineTo(-70+x,505+y);
	    q1.lineTo(-70+x,470+y);
	    q1.lineTo(-70+x,505+y);
	    q1.lineTo(-50+x,505+y);
	    q1.lineTo(-50+x,470+y);
	    q1.lineTo(-50+x,505+y);
	    q1.lineTo(-30+x,505+y);
	    q1.lineTo(-30+x,470+y);
	    q1.lineTo(-30+x,490+y);
	    q1.lineTo(-10+x,490+y);
	    q1.curveTo(-10+x,490+y,-20+x,340+y,40+x,270+y);

		g.setColor(new Color(78,182,208));
		g2.fill(q1);
		g.setColor(Color.black);
		g2.draw(q1);

 //body

	//tail

		q14.moveTo(280+x,540+y);
		q14.curveTo(280+x,540+y,500+x,570+y,280+x,580+y);
		g2.draw(q14);
		g.setColor(new Color(78,182,208));
		g2.fill(q14);



	//right leg
		q2.moveTo(310+x,505+y);
		q2.curveTo(310+x,505+y,320+x,540+y,290+x,560+y);
		q2.lineTo(250+x,560+y);
		q2.lineTo(290+x,560+y);
		q2.curveTo(290+x,560+y,335+x,565+y,340+x,580+y);
		q2.lineTo(230+x,580+y);
		g.setColor(new Color(78,182,208));
		g2.fill(q2);
		g.setColor(Color.black);
		g2.draw(q2);



	//lap
		g.setColor(new Color(78,182,208));

		CubicCurve2D cub = new CubicCurve2D.Double(230+x,580+y, 190+x, 560+y, 210+x, 520+y, 130+x, 520+y);
		g2.fill(cub);
		g.setColor(Color.black);
		g2.draw(cub);

		cub = new CubicCurve2D.Double(130+x,520+y, 50+x, 520+y, 70+x, 560+y, 30+x, 580+y);
		g.setColor(Color.black);
		g2.draw(cub);




	//mouse
		g.setColor(Color.black);
		GeneralPath q5 = new GeneralPath();
		GeneralPath q15 = new GeneralPath();
		GeneralPath q16 = new GeneralPath();
		q5.moveTo(75+x,210+y);
	    q5.curveTo(75+x,210+y,120+x,230+y,180+x,220+y);
		q5.curveTo(180+x,220+y,90+x,280+y,75+x,210+y);
		g2.draw(q5);
		q15.moveTo(90+x,245+y);
		q15.curveTo(90+x,245+y,100+x,255+y,120+x,250+y);
		g2.draw(q15);
		q16.moveTo(68+x,215+y);
		q16.curveTo(68+x,215+y,70+x,210+y,85+x,205+y);
		g2.draw(q16);



	//nose
		GeneralPath q6 = new GeneralPath();
		q6.moveTo(117+x,185+y);
	    q6.curveTo(117+x,185+y,132+x,175+y,150+x,185+y);
	    q6.lineTo(134+x,200+y);
	    q6.closePath();
		g2.draw(q6);
	    g2.setColor(new Color(11,104,127));
		g2.fill(q6);

		g2.drawLine(134+x,200+y,134+x,207+y);


	//teeth
		int tx1 [] = {90+x, 100+x, 110+x};
		int ty1 [] = {235+y, 225+y, 243+y};
		g.setColor(Color.white);
		g2.fillPolygon(tx1,ty1,3);
		int tx2 [] = {115+x, 125+x, 135+x};
		int ty2 [] = {242+y, 230+y, 240+y};
		g.setColor(Color.white);
		g2.fillPolygon(tx2,ty2,3);

	 	int tx3 [] = {160+x,165+x,170+x};
		int ty3 [] = {230+y,216+y,225+y};
		g2.setColor(Color.white);
		g2.fillPolygon(tx3,ty3,3);

		int tx4 [] = {138+x, 148+x, 158+x};
		int ty4 [] = {238+y, 226+y, 231+y};
		g.setColor(Color.white);
		g2.fillPolygon(tx4,ty4,3);


	 	int tx5 [] = {80+x,85+x,95+x};
		int ty5 [] = {214+y,225+y,216+y};
		g2.setColor(Color.white);
		g2.fillPolygon(tx5,ty5,3);


	 	int tx6 [] = {104+x,112+x,122+x};
		int ty6 [] = {218+y,232+y,222+y};
		g2.setColor(Color.white);
		g2.fillPolygon(tx6,ty6,3);

	 	int tx7 [] = {129+x,134+x,145+x};
		int ty7 [] = {222+y,234+y,223+y};
		g2.setColor(Color.white);
		g2.fillPolygon(tx7,ty7,3);




	//eye
		g2.setColor(Color.white);
		g2.fillOval(140+x,130+y,35,35);
		g2.fillOval(90+x,130+y,35,35);

	//Pupil
		g2.setColor(Color.black);
		g2.fillOval(145+x,135+y,25,25);
		g2.fillOval(95+x,135+y,25,25);

    //gfn
	    g2.setColor(new Color(11,104,127));
	    g2.fillArc(140+x,130+y,35,30,0,180);
	    g2.fillArc(90+x,130+y,35,30,0,180);
	//left brow
		g.setColor(Color.black);
	   	GeneralPath q12= new GeneralPath();
	   	q12.moveTo(60+x,100+y);
	   	q12.curveTo(60+x,100+y,90+x,80+y,120+x,135+y);
	   	q12.curveTo(120+x,135+y,100+x,120+y,60+x,120+y);
	   	q12.curveTo(60+x,120+y,55+x,115+y,60+x,100+y);
	   	g2.draw(q12);

	//right brow
	   	GeneralPath q13= new GeneralPath();
	   	q13.moveTo(135+x,120+y);
	   	q13.curveTo(135+x,110+y,175+x,100+y,185+x,120+y);
	   	q13.curveTo(185+x,130+y,145+x,130+y,135+x,135+y);
	   	q13.curveTo(135+x,135+y,130+x,130+y,135+x,120+y);
	   	g2.draw(q13);

    //right pink ellipse
		g.setColor(new Color(204,135,255));
		Ellipse2D e4 = new Ellipse2D.Double(260+x,450+y,55,80);
		g2.fill(e4);


   //right tofingures
	   	g.setColor(Color.black);
	    p1.lineTo(310+x,505+y);
	    p1.lineTo(310+x,470+y);


		p1.lineTo(310+x,505+y);
		p1.lineTo(290+x,505+y);

		p1.lineTo(290+x,470+y);

	    p1.lineTo(290+x,505+y);
	    p1.lineTo(270+x,505+y);
		p1.lineTo(270+x,470+y);
		p1.lineTo(270+x,490+y);
		p1.lineTo(250+x,490+y);

		p1.curveTo(250+x,490+y,260+x,340+y,220+x,270+y);
		g.setColor(new Color(78,182,208));
		g2.fill(p1);
		g.setColor(Color.black);
		g2.draw(p1);

  /* 	//complete face
		g.setColor(Color.black);
		q9.moveTo(200+x,160+y);
		q9.curveTo(200+x,160+y, 270+x,270+y, 130+x,300+y);
		g2.draw(q9);
		q10.moveTo(60+x,160+y);
		q10.curveTo(60+x,160+y, 20+x,210+y,50+x,250+y);
		q10.curveTo(50+x,250+y, 60+x,275+y, 110+x,290+y);
		g2.draw(q10);*/

 //pink ellipses
		g.setColor(new Color(204,135,255));
		Ellipse2D e = new Ellipse2D.Double(250+x,330+y,50,80);
		g2.fill(e);

		Ellipse2D e1 = new Ellipse2D.Double(-55+x,330+y,50,80);
		g2.fill(e1);
		g.setColor(new Color(245,155,203));
		Ellipse2D e2 = new Ellipse2D.Double(170+x,170+y,30,20);
		g2.fill(e2);
		Ellipse2D e3 = new Ellipse2D.Double(70+x,170+y,30,20);
		g2.fill(e3);
		g.setColor(new Color(204,135,255));
		QuadCurve2D Q = new QuadCurve2D.Double(220+x,190+y,260+x,200+y,260+x,240+y);
		g2.fill(Q);
		QuadCurve2D Q1 = new QuadCurve2D.Double(260+x,240+y,210+x,220+y,220+x,190+y);
		g2.fill(Q1);
		QuadCurve2D Q2 = new QuadCurve2D.Double(35+x,190+y,2+x,200+y,0+x,240+y);
		g2.fill(Q2);
		QuadCurve2D Q3 = new QuadCurve2D.Double(0+x,240+y,50+x,220+y,35+x,190+y);
		g2.fill(Q3);
    //between legs
		g.setColor(Color.black);
		q11.moveTo(50+x,560+y);
		q11.curveTo(50+x,560+y,100+x,590+y,230+x,580+y);
		g2.draw(q11);
		g.setColor(new Color(78,182,208));
		g2.fill(q11);

		int v [] = {50+x,130+x,230+x};
		int b [] = {570+y,520+y,580+y};
		g2.fillPolygon(v,b,3);

	//right leg fingers
	   	g.setColor(Color.black);
		g2.drawOval(320+x,570+y,20,30);
		g2.setColor(new Color(11,104,127));
    	g2.fillOval(320+x,570+y,20,30);
	 	g.setColor(Color.black);
		g2.drawOval(300+x,562+y,20,30);
		g2.setColor(new Color(11,104,127));
    	g2.fillOval(300+x,562+y,20,30);
    	g.setColor(Color.black);
		g2.drawOval(280+x,562+y,20,30);
		g2.setColor(new Color(11,104,127));
    	g2.fillOval(280+x,562+y,20,30);
    	g.setColor(Color.black);
		g2.drawOval(260+x,562+y,20,30);
		g2.setColor(new Color(11,104,127));
    	g2.fillOval(260+x,562+y,20,30);
		g.setColor(Color.black);
		g2.drawOval(-100+x,570+y,20,30);
		g2.setColor(new Color(11,104,127));
    	g2.fillOval(-100+x,570+y,20,30);
    	g.setColor(Color.black);
		g2.drawOval(-80+x,562+y,20,30);
		g2.setColor(new Color(11,104,127));
    	g2.fillOval(-80+x,562+y,20,30);
    	g.setColor(Color.black);
		g2.drawOval(-60+x,562+y,20,30);
		g2.setColor(new Color(11,104,127));
    	g2.fillOval(-60+x,562+y,20,30);
    	g.setColor(Color.black);
		g2.drawOval(-40+x,562+y,20,30);
		g2.setColor(new Color(11,104,127));
    	g2.fillOval(-40+x,562+y,20,30);


	//right hand fingers
		int j [] = {330+x,310+x,310+x};
		int k [] = {500+y,520+y,505+y};
		g.setColor(Color.black);
		g2.drawPolygon(j,k,3);
		g2.setColor(new Color(11,104,127));
		g2.fillPolygon(j,k,3);

		int j1 [] = {310+x,290+x,290+x};
		int k1 [] = {500+y,520+y,505+y};
		g.setColor(Color.black);
		g2.drawPolygon(j1,k1,3);
		g2.setColor(new Color(11,104,127));
		g2.fillPolygon(j1,k1,3);

		int j2 [] = {290+x,270+x,270+x};
		int k2 [] = {500+y,520+y,505+y};
		g.setColor(Color.black);
		g2.drawPolygon(j2,k2,3);
		g2.setColor(new Color(11,104,127));
		g2.fillPolygon(j2,k2,3);

		int j3 [] = {270+x,250+x,250+x};
		int k3 [] = {490+y,500+y,490+y};
		g.setColor(Color.black);
		g2.drawPolygon(j3,k3,3);
		g2.setColor(new Color(11,104,127));
		g2.fillPolygon(j3,k3,3);

	//left hand fingers
		int j4 [] = {-90+x,-70+x,-70+x};
		int k4 [] = {500+y,520+y,505+y};
		g.setColor(Color.black);
		g2.drawPolygon(j4,k4,3);
		g2.setColor(new Color(11,104,127));
		g2.fillPolygon(j4,k4,3);

		int j5 [] = {-70+x,-50+x,-50+x};
		int k5 [] = {500+y,520+y,505+y};
		g.setColor(Color.black);
		g2.drawPolygon(j5,k5,3);
		g2.setColor(new Color(11,104,127));
		g2.fillPolygon(j5,k5,3);

		int j6 [] = {-50+x,-30+x,-30+x};
		int k6 [] = {500+y,520+y,505+y};
		g.setColor(Color.black);
		g2.drawPolygon(j6,k6,3);
		g2.setColor(new Color(11,104,127));
		g2.fillPolygon(j6,k6,3);

		int j7 [] = {-30+x,-10+x,-10+x};
		int k7 [] = {490+y,500+y,490+y};
		g.setColor(Color.black);
		g2.drawPolygon(j7,k7,3);
		g2.setColor(new Color(11,104,127));
		g2.fillPolygon(j7,k7,3);  


	}
}