package lazaruz.win.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_1{

public static void LS_general(anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale) {
;
//BA.debugLineNum = 2;BA.debugLine="web.SetLeftAndRight(0,100%x)"[1/General script]
views.get("web").setLeft((int)(0d));
views.get("web").setPrefWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 3;BA.debugLine="web.SetTopAndBottom(4%y,97%y)"[1/General script]
views.get("web").setTop((int)((4d / 100 * height)));
views.get("web").setPrefHeight((int)((97d / 100 * height) - ((4d / 100 * height))));
//BA.debugLineNum = 4;BA.debugLine="tf1.SetLeftAndRight(cancel.Right+15dip,85%x)"[1/General script]
views.get("tf1").setLeft((int)((views.get("cancel").getLeft() + views.get("cancel").getPrefWidth())+(15d * scale)));
views.get("tf1").setPrefWidth((int)((85d / 100 * width) - ((views.get("cancel").getLeft() + views.get("cancel").getPrefWidth())+(15d * scale))));
//BA.debugLineNum = 5;BA.debugLine="tf1.Height=24dip"[1/General script]
views.get("tf1").setPrefHeight((int)((24d * scale)));
//BA.debugLineNum = 6;BA.debugLine="tf1.Top=0"[1/General script]
views.get("tf1").setTop((int)(0d));
//BA.debugLineNum = 7;BA.debugLine="pb1.Height=15dip"[1/General script]
views.get("pb1").setPrefHeight((int)((15d * scale)));
//BA.debugLineNum = 8;BA.debugLine="pb1.Top=97%y"[1/General script]
views.get("pb1").setTop((int)((97d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="pb1.SetLeftAndRight(70%x,100%x)"[1/General script]
views.get("pb1").setLeft((int)((70d / 100 * width)));
views.get("pb1").setPrefWidth((int)((100d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="pb2.Right=50%x"[1/General script]
views.get("pb2").setLeft((int)((50d / 100 * width) - (views.get("pb2").getPrefWidth())));
//BA.debugLineNum = 11;BA.debugLine="pb2.Top=90%y"[1/General script]
views.get("pb2").setTop((int)((90d / 100 * height)));
//BA.debugLineNum = 12;BA.debugLine="sp1.Width=263dip"[1/General script]
views.get("sp1").setPrefWidth((int)((263d * scale)));
//BA.debugLineNum = 13;BA.debugLine="sp1.Height=40%y"[1/General script]
views.get("sp1").setPrefHeight((int)((40d / 100 * height)));
//BA.debugLineNum = 14;BA.debugLine="sp1.Right=99%x"[1/General script]
views.get("sp1").setLeft((int)((99d / 100 * width) - (views.get("sp1").getPrefWidth())));
//BA.debugLineNum = 15;BA.debugLine="menu.Left=95%x"[1/General script]
views.get("menu").setLeft((int)((95d / 100 * width)));
//BA.debugLineNum = 16;BA.debugLine="ml.Left=91%x"[1/General script]
views.get("ml").setLeft((int)((91d / 100 * width)));
//BA.debugLineNum = 17;BA.debugLine="menu.Height=25dip"[1/General script]
views.get("menu").setPrefHeight((int)((25d * scale)));
//BA.debugLineNum = 18;BA.debugLine="ml.Height=25dip"[1/General script]
views.get("ml").setPrefHeight((int)((25d * scale)));
//BA.debugLineNum = 19;BA.debugLine="menu.Top=0"[1/General script]
views.get("menu").setTop((int)(0d));
//BA.debugLineNum = 20;BA.debugLine="ml.Top=0"[1/General script]
views.get("ml").setTop((int)(0d));
//BA.debugLineNum = 21;BA.debugLine="ml.Width=50dip"[1/General script]
views.get("ml").setPrefWidth((int)((50d * scale)));
//BA.debugLineNum = 22;BA.debugLine="downloadButton.Top=0"[1/General script]
views.get("downloadbutton").setTop((int)(0d));
//BA.debugLineNum = 23;BA.debugLine="downloadButton.Left=86%x"[1/General script]
views.get("downloadbutton").setLeft((int)((86d / 100 * width)));
//BA.debugLineNum = 24;BA.debugLine="downloadButton.Width=60dip"[1/General script]
views.get("downloadbutton").setPrefWidth((int)((60d * scale)));
//BA.debugLineNum = 25;BA.debugLine="downloadButton.Height=26dip"[1/General script]
views.get("downloadbutton").setPrefHeight((int)((26d * scale)));
//BA.debugLineNum = 30;BA.debugLine="status.Left=0dip"[1/General script]
views.get("status").setLeft((int)((0d * scale)));
//BA.debugLineNum = 31;BA.debugLine="status.Top=97%y"[1/General script]
views.get("status").setTop((int)((97d / 100 * height)));
//BA.debugLineNum = 33;BA.debugLine="status.Height=15dip"[1/General script]
views.get("status").setPrefHeight((int)((15d * scale)));
//BA.debugLineNum = 34;BA.debugLine="status.SetLeftAndRight(0dip,pb1.Left)"[1/General script]
views.get("status").setLeft((int)((0d * scale)));
views.get("status").setPrefWidth((int)((views.get("pb1").getLeft()) - ((0d * scale))));
//BA.debugLineNum = 35;BA.debugLine="menulist.SetLeftAndRight(1%x,260dip)"[1/General script]
views.get("menulist").setLeft((int)((1d / 100 * width)));
views.get("menulist").setPrefWidth((int)((260d * scale) - ((1d / 100 * width))));
//BA.debugLineNum = 36;BA.debugLine="menulist.SetTopAndBottom(5dip,39%y)"[1/General script]
views.get("menulist").setTop((int)((5d * scale)));
views.get("menulist").setPrefHeight((int)((39d / 100 * height) - ((5d * scale))));
//BA.debugLineNum = 37;BA.debugLine="bback.Top=0"[1/General script]
views.get("bback").setTop((int)(0d));
//BA.debugLineNum = 38;BA.debugLine="bback.Left=2dip"[1/General script]
views.get("bback").setLeft((int)((2d * scale)));
//BA.debugLineNum = 39;BA.debugLine="Bhome.Top=0"[1/General script]
views.get("bhome").setTop((int)(0d));
//BA.debugLineNum = 40;BA.debugLine="Bhome.Left=bback.Right+5dip"[1/General script]
views.get("bhome").setLeft((int)((views.get("bback").getLeft() + views.get("bback").getPrefWidth())+(5d * scale)));
//BA.debugLineNum = 41;BA.debugLine="Bfor.Top=0"[1/General script]
views.get("bfor").setTop((int)(0d));
//BA.debugLineNum = 42;BA.debugLine="Bfor.Left=Bhome.Right+5dip"[1/General script]
views.get("bfor").setLeft((int)((views.get("bhome").getLeft() + views.get("bhome").getPrefWidth())+(5d * scale)));
//BA.debugLineNum = 43;BA.debugLine="reload.Top=0"[1/General script]
views.get("reload").setTop((int)(0d));
//BA.debugLineNum = 44;BA.debugLine="reload.left=Bfor.Right+5dip"[1/General script]
views.get("reload").setLeft((int)((views.get("bfor").getLeft() + views.get("bfor").getPrefWidth())+(5d * scale)));
//BA.debugLineNum = 45;BA.debugLine="cancel.Top=0"[1/General script]
views.get("cancel").setTop((int)(0d));
//BA.debugLineNum = 46;BA.debugLine="cancel.Left=reload.Right+5dip"[1/General script]
views.get("cancel").setLeft((int)((views.get("reload").getLeft() + views.get("reload").getPrefWidth())+(5d * scale)));
//BA.debugLineNum = 47;BA.debugLine="dp.Top=tf1.Bottom+10dip"[1/General script]
views.get("dp").setTop((int)((views.get("tf1").getTop() + views.get("tf1").getPrefHeight())+(10d * scale)));
//BA.debugLineNum = 48;BA.debugLine="dp.Left=35%x"[1/General script]
views.get("dp").setLeft((int)((35d / 100 * width)));
//BA.debugLineNum = 49;BA.debugLine="dp.Width=300dip"[1/General script]
views.get("dp").setPrefWidth((int)((300d * scale)));
//BA.debugLineNum = 50;BA.debugLine="dp.Height=80dip"[1/General script]
views.get("dp").setPrefHeight((int)((80d * scale)));
//BA.debugLineNum = 51;BA.debugLine="setP.SetLeftAndRight(0%x,100%x)"[1/General script]
views.get("setp").setLeft((int)((0d / 100 * width)));
views.get("setp").setPrefWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 52;BA.debugLine="settings.SetLeftAndRight(15%x,85%x)"[1/General script]
views.get("settings").setLeft((int)((15d / 100 * width)));
views.get("settings").setPrefWidth((int)((85d / 100 * width) - ((15d / 100 * width))));
//BA.debugLineNum = 53;BA.debugLine="setP.SetTopAndBottom(0%y,100%y)"[1/General script]
views.get("setp").setTop((int)((0d / 100 * height)));
views.get("setp").setPrefHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 54;BA.debugLine="settings.SetTopAndBottom(10%y,80%y)"[1/General script]
views.get("settings").setTop((int)((10d / 100 * height)));
views.get("settings").setPrefHeight((int)((80d / 100 * height) - ((10d / 100 * height))));
//BA.debugLineNum = 55;BA.debugLine="os.Width=100dip"[1/General script]
views.get("os").setPrefWidth((int)((100d * scale)));
//BA.debugLineNum = 56;BA.debugLine="os.Height=30dip"[1/General script]
views.get("os").setPrefHeight((int)((30d * scale)));
//BA.debugLineNum = 57;BA.debugLine="os.Left=45%x"[1/General script]
views.get("os").setLeft((int)((45d / 100 * width)));
//BA.debugLineNum = 58;BA.debugLine="os.Top=92%y"[1/General script]
views.get("os").setTop((int)((92d / 100 * height)));

}
}