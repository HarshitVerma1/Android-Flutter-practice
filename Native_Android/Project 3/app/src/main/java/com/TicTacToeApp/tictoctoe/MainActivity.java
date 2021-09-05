package com.TicTacToeApp.tictoctoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    String winnerStr="";
    boolean gameActive=true;
    TextView statusTxt;
    public static int count=0;
    /**
     *  O====>X
     *  1====>O
     *  2=====>BLANK
     *  There are 8 wining Positions :)
     */
    int activePlayer=0;
    int[] gameState={2,2,2,2,2,2,2,2,2};
    int[][] winPositions={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playerTap(View view) {

        ImageView img= (ImageView) view;
        int tappedImage=Integer.parseInt(img.getTag().toString());
        if (gameState[tappedImage] == 2 && gameActive) {
            gameState[tappedImage]=activePlayer;
            img.setTranslationY(-1000f);
            if (activePlayer == 0) {
                img.setImageResource(R.drawable.tictaccross);
                activePlayer=1;
                statusTxt=findViewById(R.id.status);
                if (count <8) {
                    statusTxt.setText("Now the turn of 'O'");
                    ++count;
                }
                else{
                    statusTxt.setText("Game Finished !");
                    Snackbar.make(view,"Match Draw, No one has win!!",500000)
                            .setAction("RESET", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    resetGame(view);
                                }
                            }).show();
                }

            }
            else{
                img.setImageResource(R.drawable.tictaczero);
                activePlayer=0;
                statusTxt=findViewById(R.id.status);
                if (count <8) {
                    statusTxt.setText("Now the turn of 'X'");
                    ++count;
                }
                else{
                    statusTxt.setText("Game Finished !");

                }
            }
            img.animate().translationYBy(1000f).setDuration(300);
        }
        /**
         * Check here Your Winning positions
         */

        for (int[] winPosition: winPositions) {
            if(gameState[winPosition[0]] == gameState[winPosition[1]] &&
                    gameState[winPosition[1]] == gameState[winPosition[2]] &&
                    gameState[winPosition[2]] == gameState[winPosition[0]] &&
                    gameState[winPosition[0]]!=2&&gameState[winPosition[1]]!=2&&gameState[winPosition[2]]!=2)
            {
                // Somebody has won! - Find out who!
                gameActive = false;
                if(gameState[winPosition[0]] == 0){
                    winnerStr = "X has won";
                }
                else{
                    winnerStr = "O has won";
                }
                // Update the status bar for winner announcement
                statusTxt.setText("Somebody has won! Please tap on RESET");
                Snackbar.make(view,winnerStr,500000)
                        .setAction("RESET", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                resetGame(view);
                            }
                        }).show();
            }
//            else
//            {
//                if(count==9){
//                    Snackbar.make(view, "Match Draw, No one has win!!", Snackbar.LENGTH_LONG)
//                            .setAction("RESET", new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//                                    resetGame(view);
//                                }
//                            }).show();
//                }
//                ++count;
//            }
        }

    }

    private void resetGame(View view) {
        gameActive=true;
        count=0;
        activePlayer=0;
        gameState= new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        statusTxt.setText("Hey Dear! Start The Game...");

    }

}
