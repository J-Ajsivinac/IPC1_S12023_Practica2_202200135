package Elementos;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.util.function.Function;
import javax.swing.JLabel;

public class SVGImages extends JLabel {

    private FlatSVGIcon svgIcono;

    public void setSvgImages(String imagen, int width, int height) {
        svgIcono = new FlatSVGIcon(imagen, width, height);
        svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
            @Override
            public Color apply(Color t) {
                return new Color(177, 179, 183);
            }//

        }));
        setIcon(svgIcono);
    }

    public void cambiar() {
        Color initialColor = new Color(177, 179, 183);
        Color finalColor = new Color(1, 113, 195);
        Thread moveThread2 = new Thread(() -> {
            int duration = 800; // Duración de la transición en milisegundos
            int steps = 60; // Número de pasos de la transición

            for (int i = 0; i <= steps; i++) {
                float ratio = (float) i / steps;
                int r = (int) (initialColor.getRed() + (finalColor.getRed() - initialColor.getRed()) * ratio);
                int g = (int) (initialColor.getGreen() + (finalColor.getGreen() - initialColor.getGreen()) * ratio);
                int b = (int) (initialColor.getBlue() + (finalColor.getBlue() - initialColor.getBlue()) * ratio);
                Color color = new Color(r, g, b);
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return color;
                    }
                }));

                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(duration / steps);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        moveThread2.start();
    }

    public void T1() {
        Color initialColor = new Color(1, 113, 195);
        Color finalColor = new Color(51, 169, 254);
        Thread moveThread2 = new Thread(() -> {
            int duration = 200; // Duración de la transición en milisegundos
            int steps = 50; // Número de pasos de la transición

            for (int i = 0; i <= steps; i++) {
                float ratio = (float) i / steps;
                int r = (int) (initialColor.getRed() + (finalColor.getRed() - initialColor.getRed()) * ratio);
                int g = (int) (initialColor.getGreen() + (finalColor.getGreen() - initialColor.getGreen()) * ratio);
                int b = (int) (initialColor.getBlue() + (finalColor.getBlue() - initialColor.getBlue()) * ratio);
                Color color = new Color(r, g, b);
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return color;
                    }
                }));

                SVGImages.this.repaint();

                this.revalidate();
                try {
                    Thread.sleep(duration / steps);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        moveThread2.start();
    }

    public void T2() {
        Color initialColor = new Color(23, 144, 87);
        Color finalColor = new Color(53, 223, 145);
        Thread moveThread2 = new Thread(() -> {
            int duration = 200; // Duración de la transición en milisegundos
            int steps = 50; // Número de pasos de la transición

            for (int i = 0; i <= steps; i++) {
                float ratio = (float) i / steps;
                int r = (int) (initialColor.getRed() + (finalColor.getRed() - initialColor.getRed()) * ratio);
                int g = (int) (initialColor.getGreen() + (finalColor.getGreen() - initialColor.getGreen()) * ratio);
                int b = (int) (initialColor.getBlue() + (finalColor.getBlue() - initialColor.getBlue()) * ratio);
                Color color = new Color(r, g, b);
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return color;
                    }
                }));

                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(duration / steps);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        moveThread2.start();
    }

    public void T3() {
        Color initialColor = new Color(227, 152, 7);
        Color finalColor = new Color(250, 199, 98);
        Thread moveThread2 = new Thread(() -> {
            int duration = 200; // Duración de la transición en milisegundos
            int steps = 50; // Número de pasos de la transición

            for (int i = 0; i <= steps; i++) {
                float ratio = (float) i / steps;
                int r = (int) (initialColor.getRed() + (finalColor.getRed() - initialColor.getRed()) * ratio);
                int g = (int) (initialColor.getGreen() + (finalColor.getGreen() - initialColor.getGreen()) * ratio);
                int b = (int) (initialColor.getBlue() + (finalColor.getBlue() - initialColor.getBlue()) * ratio);
                Color color = new Color(r, g, b);
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return color;
                    }
                }));

                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(duration / steps);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        moveThread2.start();
    }

    public void T4() {
        Color initialColor = new Color(215, 47, 15);
        Color finalColor = new Color(244, 121, 96);
        Thread moveThread2 = new Thread(() -> {
            int duration = 200; // Duración de la transición en milisegundos
            int steps = 50; // Número de pasos de la transición

            for (int i = 0; i <= steps; i++) {
                float ratio = (float) i / steps;
                int r = (int) (initialColor.getRed() + (finalColor.getRed() - initialColor.getRed()) * ratio);
                int g = (int) (initialColor.getGreen() + (finalColor.getGreen() - initialColor.getGreen()) * ratio);
                int b = (int) (initialColor.getBlue() + (finalColor.getBlue() - initialColor.getBlue()) * ratio);
                Color color = new Color(r, g, b);
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return color;
                    }
                }));

                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(duration / steps);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                @Override
                public Color apply(Color t) {
                    return initialColor;
                }
            }));
            SVGImages.this.repaint();
            this.revalidate();
        });

        moveThread2.start();
    }

    public void transicionProduccion() {
        Color initialColor = new Color(1, 113, 195);
        //vrgb(23, 144, 87)
        Color finalColor = new Color(23, 144, 87);
        Thread moveThread2 = new Thread(() -> {
            int duration = 200; // Duración de la transición en milisegundos
            int steps = 50; // Número de pasos de la transición

            for (int i = 0; i <= steps; i++) {
                float ratio = (float) i / steps;
                int r = (int) (initialColor.getRed() + (finalColor.getRed() - initialColor.getRed()) * ratio);
                int g = (int) (initialColor.getGreen() + (finalColor.getGreen() - initialColor.getGreen()) * ratio);
                int b = (int) (initialColor.getBlue() + (finalColor.getBlue() - initialColor.getBlue()) * ratio);
                Color color = new Color(r, g, b);
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return color;
                    }
                }));

                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(duration / steps);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        moveThread2.start();
    }

    public void transicionEmpaquetado() {
        Color initialColor = new Color(23, 141, 8);
        Color finalColor = new Color(227, 152, 7);
        Thread moveThread2 = new Thread(() -> {
            int duration = 500; // Duración de la transición en milisegundos
            int steps = 4; // Número de pasos de la transición

            for (int i = 0; i <= steps; i++) {
                float ratio = (float) i / steps;
                int r = (int) (initialColor.getRed() + (finalColor.getRed() - initialColor.getRed()) * ratio);
                int g = (int) (initialColor.getGreen() + (finalColor.getGreen() - initialColor.getGreen()) * ratio);
                int b = (int) (initialColor.getBlue() + (finalColor.getBlue() - initialColor.getBlue()) * ratio);
                Color color = new Color(r, g, b);
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return color;
                    }
                }));

                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(duration / steps);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        moveThread2.start();
    }

    public void transicionSalida() {
        Color initialColor = new Color(227, 152, 7);
        Color finalColor = new Color(215, 47, 15);
        Thread moveThread2 = new Thread(() -> {
            int duration = 500; // Duración de la transición en milisegundos
            int steps = 4; // Número de pasos de la transición

            for (int i = 0; i <= steps; i++) {
                float ratio = (float) i / steps;
                int r = (int) (initialColor.getRed() + (finalColor.getRed() - initialColor.getRed()) * ratio);
                int g = (int) (initialColor.getGreen() + (finalColor.getGreen() - initialColor.getGreen()) * ratio);
                int b = (int) (initialColor.getBlue() + (finalColor.getBlue() - initialColor.getBlue()) * ratio);
                Color color = new Color(r, g, b);
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return color;
                    }
                }));

                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(duration / steps);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        moveThread2.start();
    }

    public void cambiFlecha1() {
        Color fondo = new Color(177, 179, 183);
        Color transicion = new Color(60, 180, 255);
        Thread moveThread2 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return transicion;
                    }
                }));
                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(18);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return fondo;
                    }
                }));
                SVGImages.this.repaint();
                this.revalidate();
            }
        });
        moveThread2.start();

    }

    public void cambiFlecha2() {
        Color fondo = new Color(177, 179, 183);
        Color transicion = new Color(53, 223, 145);
        Thread moveThread2 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return transicion;
                    }
                }));
                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(18);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return fondo;
                    }
                }));
                SVGImages.this.repaint();
                this.revalidate();
            }
        });
        moveThread2.start();
    }

    public void cambiFlecha3() {
        Color fondo = new Color(177, 179, 183);
        Color transicion = new Color(250, 199, 98);
        Thread moveThread2 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return transicion;
                    }
                }));
                SVGImages.this.repaint();
                this.revalidate();
                try {
                    Thread.sleep(18);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                svgIcono.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                    @Override
                    public Color apply(Color t) {
                        return fondo;
                    }
                }));
                SVGImages.this.repaint();
                this.revalidate();
            }
        });
        moveThread2.start();
    }
}
