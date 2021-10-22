import 'package:flutter/material.dart';
// import 'package:url_launcher/url_launcher.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'BellGang Task',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          Container(
            decoration: BoxDecoration(
                gradient: LinearGradient(
              begin: Alignment.topRight,
              end: Alignment.bottomLeft,
              colors: [
                Color(0xffddd6f3),
                // Color(0xFFCF5CCF),
                // Color(0xFFFF57AC),
                // Color(0xFFFF6D91),
                // Color(0xFFFF8D7E),
                Color(0xfffaaca8),
              ],
              stops: [0.05, 1], //stops: [0.05, 0.3, 0.5, 0.55, 0.8,  1]
            )),
          ),
          Directionality(
              textDirection: TextDirection.ltr,
              child: ListView(
                children: [
                  ListTile(
                    contentPadding: EdgeInsets.all(20),
                    leading: Image(
                      image: AssetImage('images/logo.png'),
                      alignment: Alignment.topLeft,
                      height: 300,
                      width: 300,
                    ),
                    trailing: Text(
                      "Login",
                      style: TextStyle(
                          fontSize: 23,
                          decoration: TextDecoration.underline,
                          color: Colors.brown),
                    ),
                  ),
                  // Divider(
                  //   color: Colors.black,
                  // )
                  Row(
                    children: [
                      Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Container(
                              width: 800,
                              margin: EdgeInsets.only(
                                  top: 40, left: 40, right: 10, bottom: 10),
                              child: Text(
                                "Figure out who your real Supporters are ",
                                textDirection: TextDirection.ltr,
                                style: TextStyle(
                                  decoration: TextDecoration.none,
                                  color: Colors.brown,
                                  fontSize: 40,
                                  fontWeight: FontWeight.bold,
                                ),
                              )),
                          Container(
                              width: 800,
                              margin: EdgeInsets.only(left: 40),
                              child: Text(
                                "No Longer Reward Random viewers and give your Community another reason to come back ",
                                textDirection: TextDirection.ltr,
                                style: TextStyle(
                                  decoration: TextDecoration.none,
                                  fontSize: 30,
                                  fontFamily: 'Ubuntu',
                                  fontWeight: FontWeight.w100,
                                ),
                              )),
                          Container(
                            margin: EdgeInsets.only(left: 40, top: 10),
                            child: ElevatedButton(
                                child: Text("Get started with Google",
                                    style: TextStyle(fontSize: 30)),
                                style: ButtonStyle(
                                    padding:
                                        MaterialStateProperty.all<EdgeInsets>(
                                            EdgeInsets.all(15)),
                                    foregroundColor:
                                        MaterialStateProperty.all<Color>(
                                            Colors.white),
                                    backgroundColor:
                                        MaterialStateProperty.all<Color>(
                                            Colors.blueAccent),
                                    shape: MaterialStateProperty.all<RoundedRectangleBorder>(
                                        RoundedRectangleBorder(
                                            borderRadius:
                                                BorderRadius.all(Radius.circular(20)),
                                            side: BorderSide(color: Colors.red)))),
                                onPressed: () => null),
                          ),
                          Container(
                              margin:
                                  EdgeInsets.only(top: 15, left: 40, right: 10),
                              child: Text(
                                "We would love to speak to you :)",
                                textDirection: TextDirection.ltr,
                                style: TextStyle(
                                  decoration: TextDecoration.none,
                                  color: Colors.black,
                                  fontSize: 15,
                                ),
                              )),
                          Container(
                              margin: EdgeInsets.only(
                                  left: 40, right: 10, bottom: 10),
                              child: Text(
                                "Call or WhatsApp Vikram at +1 (203) 502-9558\nWhatsApp Rohan at:+91 99714 30120",
                                textDirection: TextDirection.ltr,
                                style: TextStyle(
                                  decoration: TextDecoration.underline,
                                  color: Colors.blue,
                                  fontSize: 15,
                                ),
                              ))
                        ],
                      ),
                      Container(
                        margin: EdgeInsets.only(top: 20),
                        child: Image(
                          image: AssetImage('images/png1.png'),
                          height: 580,
                        ),
                      ),
                      Container(
                        margin: EdgeInsets.only(top: 20, left: 20),
                        child: Image(
                          image: AssetImage('images/png2.png'),
                          height: 580,
                        ),
                      )
                    ],
                  ),
                  SizedBox(
                    height: 50,
                  ),
                  Divider(
                    color: Colors.black,
                    indent: 50,
                    endIndent: 50,
                  ),
                  Column(
                    children: [
                      Container(
                          margin: EdgeInsets.only(top: 30, bottom: 10),
                          child: Text(
                            "Step 1",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              color: Colors.black,
                              fontSize: 50,
                              fontWeight: FontWeight.w900,
                            ),
                          )),
                      Container(
                          margin: EdgeInsets.only(top: 15, right: 40, left: 40),
                          child: Center(
                              child: Text(
                            "Make your own creater points and loyality program.\n Your subscribers earn your currency overtime to claim your rewards.",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              fontWeight: FontWeight.w100,
                              color: Colors.black,
                              fontSize: 30,
                            ),
                            textAlign: TextAlign.center,
                          )))
                    ],
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Container(
                        margin: EdgeInsets.only(
                            top: 40, left: 15, right: 30, bottom: 40),
                        child: Image(
                          image: AssetImage('images/png3.png'),
                          height: 200,
                        ),
                      ),
                      Container(
                        margin: EdgeInsets.only(top: 40, left: 40, bottom: 40),
                        child: Image(
                          image: AssetImage('images/png4.png'),
                          height: 500,
                        ),
                      )
                    ],
                  ),
                  Divider(
                    color: Colors.black,
                    indent: 50,
                    endIndent: 50,
                  ),
                  Column(
                    children: [
                      Container(
                          margin: EdgeInsets.only(top: 30, bottom: 10),
                          child: Text(
                            "Step 2",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              color: Colors.black,
                              fontSize: 50,
                              fontWeight: FontWeight.w900,
                            ),
                          )),
                      Container(
                          margin: EdgeInsets.only(top: 15, right: 40, left: 40),
                          child: Center(
                              child: Text(
                            "Subscribers who smash that bell are waiting for you to upload,with a timer, you can",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              fontWeight: FontWeight.w100,
                              color: Colors.black,
                              fontSize: 30,
                            ),
                            textAlign: TextAlign.center,
                          )))
                    ],
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Container(
                        margin: EdgeInsets.only(
                            top: 40, left: 15, right: 30, bottom: 40),
                        child: Image(
                          image: AssetImage('images/png5.png'),
                          height: 500,
                        ),
                      ),
                    ],
                  ),
                  Divider(
                    color: Colors.black,
                    indent: 50,
                    endIndent: 50,
                  ),
                  Column(
                    children: [
                      Container(
                          margin: EdgeInsets.only(top: 30, bottom: 10),
                          child: Text(
                            "Step 3",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              color: Colors.black,
                              fontSize: 50,
                              fontWeight: FontWeight.w900,
                            ),
                          )),
                      Container(
                          margin: EdgeInsets.only(top: 15, right: 40, left: 40),
                          child: Center(
                              child: Text(
                            "Viewers who watch your entire video Are your real supporters. with trivia you can finally",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              fontWeight: FontWeight.w100,
                              color: Colors.black,
                              fontSize: 30,
                            ),
                            textAlign: TextAlign.center,
                          )))
                    ],
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Container(
                        margin: EdgeInsets.only(
                            top: 40, left: 15, right: 30, bottom: 40),
                        child: Image(
                          image: AssetImage('images/png6.png'),
                          height: 500,
                        ),
                      ),
                    ],
                  ),
                  Divider(
                    color: Colors.black,
                    indent: 50,
                    endIndent: 50,
                  ),
                  Column(
                    children: [
                      Container(
                          margin: EdgeInsets.only(top: 30, bottom: 10),
                          child: Text(
                            "Step 4",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              color: Colors.black,
                              fontSize: 50,
                              fontWeight: FontWeight.w900,
                            ),
                          )),
                      Container(
                          margin: EdgeInsets.only(top: 15, right: 40, left: 40),
                          child: Center(
                              child: Text(
                            "Post the link in the description of your video and reward your loyal supporters.",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              fontWeight: FontWeight.w100,
                              color: Colors.black,
                              fontSize: 30,
                            ),
                            textAlign: TextAlign.center,
                          )))
                    ],
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Container(
                        margin: EdgeInsets.only(
                            top: 40, left: 15, right: 30, bottom: 40),
                        child: Image(
                          image: AssetImage('images/png7.png'),
                          height: 500,
                        ),
                      ),
                      Container(
                        margin: EdgeInsets.only(top: 40, left: 40, bottom: 40),
                        child: Image(
                          image: AssetImage('images/png8.png'),
                          height: 500,
                        ),
                      )
                    ],
                  ),
                  Divider(
                    color: Colors.black,
                    indent: 50,
                    endIndent: 50,
                  ),
                  Column(
                    children: [
                      Container(
                          margin: EdgeInsets.only(top: 15, right: 40, left: 40),
                          child: Center(
                              child: Text(
                            "The Biggest brands in the world use loyalty programs - because they work",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              fontWeight: FontWeight.w900,
                              color: Colors.black,
                              fontSize: 30,
                            ),
                            textAlign: TextAlign.center,
                          )))
                    ],
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Expanded(
                          child: Container(
                        margin: EdgeInsets.only(
                            top: 40, left: 40, bottom: 40, right: 40),
                        child: Image(
                          image: AssetImage('images/brandlogos.png'),
                          fit: BoxFit.fill,
                          color: Colors.black54,
                        ),
                      ))
                    ],
                  ),
                  Divider(
                    color: Colors.black,
                    indent: 50,
                    endIndent: 50,
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Expanded(
                          child: Container(
                        margin: EdgeInsets.only(
                            top: 40, right: 100, left: 100, bottom: 40),
                        child: Image(
                          image: AssetImage('images/statsText.png'),
                          fit: BoxFit.fill,
                        ),
                      ))
                    ],
                  ),
                  Divider(
                    color: Colors.black,
                    indent: 50,
                    endIndent: 50,
                  ),
                  Column(
                    children: [
                      Container(
                          margin: EdgeInsets.only(top: 15, right: 40, left: 40),
                          child: Center(
                              child: Text(
                            "YouTubers are brand too!",
                            textDirection: TextDirection.ltr,
                            style: TextStyle(
                              decoration: TextDecoration.none,
                              fontWeight: FontWeight.w900,
                              color: Colors.black,
                              fontSize: 60,
                            ),
                            textAlign: TextAlign.center,
                          ))),
                      Center(
                        child: Row(
                          children: [
                            Column(
                              children: [
                                Container(
                                  margin: EdgeInsets.only(
                                      right: 590,
                                      left: 600,
                                      top: 10,
                                      bottom: 50),
                                  child: ElevatedButton(
                                      child: Text("Get started with Google",
                                          style: TextStyle(fontSize: 30)),
                                      style: ButtonStyle(
                                          alignment: Alignment.center,
                                          padding: MaterialStateProperty.all<EdgeInsets>(
                                              EdgeInsets.all(15)),
                                          foregroundColor:
                                              MaterialStateProperty.all<Color>(
                                                  Colors.white),
                                          backgroundColor:
                                              MaterialStateProperty.all<Color>(
                                                  Colors.blueAccent),
                                          shape: MaterialStateProperty.all<RoundedRectangleBorder>(
                                              RoundedRectangleBorder(
                                                  borderRadius: BorderRadius.all(Radius.circular(20)),
                                                  side: BorderSide(color: Colors.red)))),
                                      onPressed: () => null),
                                ),
                              ],
                            ),
                          ],
                        ),
                      ),
                    ],
                  ),

                  SizedBox(
                    height: 30,
                  )
                ],
              ))
        ],
      ),
    );
  }
}
