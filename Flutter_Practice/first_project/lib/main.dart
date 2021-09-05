import 'package:flutter/material.dart';

void main() {
  // runApp(Text(
  //   "Radhe Radhe!!",
  //   textDirection: TextDirection.ltr,
  // ));

// ========================================================================================================

  // runApp(Center(
  //     child: Text(
  //   "Hello Flutter!!",
  //   textDirection: TextDirection.ltr,
  //   style: TextStyle(fontSize: 50.0),
  // )));

// ========================================================================================================

  // runApp(MaterialApp(
  //   title: "Radhe Radhe!!",
  //   home: Scaffold(
  //     appBar: AppBar(
  //       title: Text(
  //         "Android Developer!",
  //         style: TextStyle(fontSize: 25),
  //       ),
  //       backgroundColor: Colors.red,
  //     ),
  //     backgroundColor: Colors.redAccent,
  //     body: Center(
  //       child: Text(
  //         "It is a Material App",
  //         style: TextStyle(fontSize: 40, color: Colors.brown),
  //       ),
  //     ),
  //   ),
  // ));

  // ========================================================================================================

  // runApp(MaterialApp(
  //   title: "Radhe Radhe!!",
  //   home: Scaffold(
  //       appBar: AppBar(
  //         title: Text(
  //           "Android Developer!",
  //           style: TextStyle(fontSize: 25),
  //         ),
  //         backgroundColor: Colors.red,
  //       ),
  //       backgroundColor: Colors.redAccent,
  //       // body: Image(
  //       //   image: AssetImage('images/indian_flag.jpg'),
  //       //   fit: BoxFit.cover,
  //       // )
  //       body: Image(
  //         image: NetworkImage(
  //             'https://cdn.pixabay.com/photo/2019/06/06/13/36/italy-4256017_960_720.jpg'),
  //         fit: BoxFit.cover,
  //       )),
  // ));

// ========================================================================================================

  runApp(MaterialApp(
    title: "Er. Harshit",
    home: Scaffold(
        appBar: AppBar(
          title: Text(
            "My Gallary !",
          ),
        ),
        body: GridView.count(
          crossAxisCount: 4,
          // body: GridView.extent(
          //   maxCrossAxisExtent: 350,
          // mainAxisSpacing: 10,
          crossAxisSpacing: 10,
          children: [
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/07/05/09/35/bride-6388640_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/08/17/06/19/bride-6552057_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2019/06/22/18/31/love-4292211_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/08/03/02/18/couple-6518232_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/08/03/02/18/couple-6518232_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/05/05/07/00/bride-6230420_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/07/25/11/58/couple-6491659_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/01/27/15/54/wedding-5955351_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/04/12/17/21/wedding-6173363_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/01/19/03/08/wedding-5929947_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2019/10/21/08/28/couple-4565426_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/02/24/23/45/couple-6047792_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/02/11/08/43/couple-6004642_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2020/09/15/20/35/hand-5574694_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/01/05/07/17/couple-5890023_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2018/05/12/03/18/sunset-3392348_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/02/15/13/04/couple-6017739_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2020/06/25/03/04/couple-5338310_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/01/19/03/16/wedding-5929956_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/01/19/03/16/wedding-5929956_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/01/04/07/33/man-5886719_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/01/06/21/50/couple-5895728_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2020/09/19/09/40/sunset-5584004_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2020/10/28/11/28/couple-5693164_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2020/08/26/15/41/wedding-5519806_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/04/14/18/05/couple-1329349_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2019/12/28/02/16/senior-4723737_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2019/09/01/18/02/wedding-4445670_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/11/30/02/16/couple-2987453_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2019/05/30/14/43/kiss-4239982_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/01/19/18/06/hands-1150073_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2018/03/01/07/05/love-3189898_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/08/06/01/26/love-2587456_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/03/14/14/21/bride-1255520_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/02/06/17/28/wedding-1183270_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/11/23/15/24/couple-1853499_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/08/01/08/16/man-2563426_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2014/09/07/17/02/couple-437987_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2015/11/07/11/55/couple-1031639_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/06/20/21/33/couple-2424928_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/11/18/18/32/wedding-1836315_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2015/11/07/11/55/young-couple-1031642_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/11/23/15/29/man-1853532_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/09/01/19/26/portrait-2705249_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/03/12/21/03/children-1252736_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/09/30/22/33/couple-1706572_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/02/06/17/28/wedding-1183270_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2015/11/07/11/03/couple-1030767_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/02/11/08/43/couple-6004642_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/11/30/02/16/couple-2987453_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/08/21/20/22/love-2666677_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/07/31/20/44/mountain-2560893_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2015/09/18/19/56/boy-946213_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2019/06/24/17/20/passion-4296544_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/05/29/14/03/kissing-2353862_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2019/02/11/15/48/love-3990000_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/04/30/21/38/couple-1363962_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/08/07/00/52/black-and-white-2598124_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2021/08/19/10/05/pair-6557654_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/06/25/12/46/snow-white-1478800_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2018/09/09/23/49/couple-3665841_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2015/01/11/10/34/kiss-596093_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2015/11/02/21/37/couple-1019127_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/08/26/16/29/couple-2683535_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/12/27/19/36/beach-wedding-1934718_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2015/09/07/22/52/wedding-929293_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2016/03/02/21/27/couple-1233139_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/10/10/22/29/kiss-2839129_960_720.jpg")),
            Image(
                image: NetworkImage(
                    "https://cdn.pixabay.com/photo/2017/08/06/15/17/people-2593403_960_720.jpg")),
          ],
        )),
  ));
}
