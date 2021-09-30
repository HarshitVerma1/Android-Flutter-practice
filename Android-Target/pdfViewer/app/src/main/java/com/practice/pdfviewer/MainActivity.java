package com.practice.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class MainActivity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfView=findViewById(R.id.pdfView);
        findViewById(R.id.btn_load).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfView.fromAsset("Resume.pdf")
//                .pages() // all pages are displayed by default
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .swipeHorizontal(false)
                        .enableDoubletap(true)
                        .defaultPage(0)
                        // allows to draw something on the current page, usually visible in the middle of the screen
                        .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                        .password(null)
                        .scrollHandle(null)
                        .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                        // spacing between pages in dp. To define spacing color, set view background
                        .spacing(0)
                        .autoSpacing(false) // add dynamic spacing to fit each page on its own on the screen

                        .pageFitPolicy(FitPolicy.WIDTH) // mode to fit pages in the view
                        .fitEachPage(false) // fit each page to the view, else smaller pages are scaled relative to largest page.
                        .pageSnap(false) // snap pages to screen boundaries
                        .pageFling(false) // make a fling change only a single page like ViewPager
                        .nightMode(false) // toggle night mode
                        .load();

            }
        });

        findViewById(R.id.btn_night).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfView.fromAsset("Resume.pdf")

                        .swipeHorizontal(true)
                        .enableDoubletap(true)
                        .defaultPage(0)
                        // allows to draw something on the current page, usually visible in the middle of the screen
                        .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                        .password(null)
                        .scrollHandle(null)
                        .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                        // spacing between pages in dp. To define spacing color, set view background
                        .spacing(0)
                        .autoSpacing(false) // add dynamic spacing to fit each page on its own on the screen

                        .pageFitPolicy(FitPolicy.WIDTH) // mode to fit pages in the view
                        .fitEachPage(false) // fit each page to the view, else smaller pages are scaled relative to largest page.
                        .pageSnap(false) // snap pages to screen boundaries
                        .pageFling(false) // make a fling change only a single page like ViewPager
                        .nightMode(true) // toggle night mode
                        .enableSwipe(true)
                        .load();

            }
        });

        findViewById(R.id.btn_swap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfView.fromAsset("Resume.pdf")
//                .pages() // all pages are displayed by default
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .swipeHorizontal(true)
                        .enableDoubletap(true)
                        .defaultPage(0)
                        // allows to draw something on the current page, usually visible in the middle of the screen
                        .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                        .password(null)
                        .scrollHandle(null)
                        .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                        // spacing between pages in dp. To define spacing color, set view background
                        .spacing(0)
                        .autoSpacing(false) // add dynamic spacing to fit each page on its own on the screen

                        .pageFitPolicy(FitPolicy.WIDTH) // mode to fit pages in the view
                        .fitEachPage(false) // fit each page to the view, else smaller pages are scaled relative to largest page.
                        .pageSnap(false) // snap pages to screen boundaries
                        .pageFling(false) // make a fling change only a single page like ViewPager
                        .nightMode(false) // toggle night mode
                        .load();
            }
        });
    }
}