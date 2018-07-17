package lazaruz.win;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class downloadservice extends Object{
public static downloadservice mostCurrent = new downloadservice();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("lazaruz.win", "lazaruz.win.downloadservice", null);
		ba.loadHtSubs(downloadservice.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "lazaruz.win.downloadservice", ba);
		}
	}
    public static Class<?> getObject() {
		return downloadservice.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _jobs = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static lazaruz.win.main _main = null;
public static lazaruz.win.strings _strings = null;
public static lazaruz.win.httputils2service _httputils2service = null;
public static class _downloaddata{
public boolean IsInitialized;
public String url;
public Object Target;
public String EventName;
public void Initialize() {
IsInitialized = true;
url = "";
Target = new Object();
EventName = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _jobtag{
public boolean IsInitialized;
public lazaruz.win.downloadservice._downloaddata Data;
public anywheresoftware.b4a.randomaccessfile.CountingStreams.CountingOutput CountingStream;
public long Total;
public void Initialize() {
IsInitialized = true;
Data = new lazaruz.win.downloadservice._downloaddata();
CountingStream = new anywheresoftware.b4a.randomaccessfile.CountingStreams.CountingOutput();
Total = 0L;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _canceldownload(String _url) throws Exception{
lazaruz.win.httpjob _job = null;
lazaruz.win.downloadservice._jobtag _jt = null;
 //BA.debugLineNum = 42;BA.debugLine="Public Sub CancelDownload(url As String)";
 //BA.debugLineNum = 43;BA.debugLine="If jobs.ContainsKey(url) = False Then";
if (_jobs.ContainsKey((Object)(_url))==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 44;BA.debugLine="Log(\"Ignoring cancel request.\")";
anywheresoftware.b4a.keywords.Common.Log("Ignoring cancel request.");
 //BA.debugLineNum = 45;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 47;BA.debugLine="Dim job As HttpJob = jobs.Get(url)";
_job = (lazaruz.win.httpjob)(_jobs.Get((Object)(_url)));
 //BA.debugLineNum = 48;BA.debugLine="Dim jt As JobTag = job.Tag";
_jt = (lazaruz.win.downloadservice._jobtag)(_job._tag);
 //BA.debugLineNum = 49;BA.debugLine="If jt.CountingStream.IsInitialized Then";
if (_jt.CountingStream.IsInitialized()) { 
 //BA.debugLineNum = 50;BA.debugLine="jt.CountingStream.Close";
_jt.CountingStream.Close();
 }else {
 //BA.debugLineNum = 52;BA.debugLine="jt.Data.url = \"\"";
_jt.Data.url = "";
 };
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public static String  _endtimer() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Private Sub EndTimer";
 //BA.debugLineNum = 21;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(lazaruz.win.httpjob _job) throws Exception{
lazaruz.win.downloadservice._jobtag _jt = null;
 //BA.debugLineNum = 66;BA.debugLine="Sub JobDone(job As HttpJob)";
 //BA.debugLineNum = 67;BA.debugLine="jobs.Remove(job.JobName)";
_jobs.Remove((Object)(_job._jobname));
 //BA.debugLineNum = 68;BA.debugLine="Dim jt As JobTag = job.Tag";
_jt = (lazaruz.win.downloadservice._jobtag)(_job._tag);
 //BA.debugLineNum = 69;BA.debugLine="If jobs.Size = 0 Then EndTimer";
if (_jobs.getSize()==0) { 
_endtimer();};
 //BA.debugLineNum = 70;BA.debugLine="If job.Success Then";
if (_job._success) { 
 //BA.debugLineNum = 71;BA.debugLine="CallSubDelayed3(jt.Data.Target, jt.Data.EventNam";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(ba,_jt.Data.Target,_jt.Data.EventName+"_Progress",(Object)(_jt.CountingStream.getCount()),(Object)(_jt.Total));
 //BA.debugLineNum = 73;BA.debugLine="CallSubDelayed2(jt.Data.Target, jt.Data.EventNam";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba,_jt.Data.Target,_jt.Data.EventName+"_Complete",(Object)(_job));
 }else {
 //BA.debugLineNum = 76;BA.debugLine="Log(job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log(_job._errormessage);
 //BA.debugLineNum = 77;BA.debugLine="CallSubDelayed2(jt.Data.Target, jt.Data.EventNam";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba,_jt.Data.Target,_jt.Data.EventName+"_Complete",(Object)(_job));
 };
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private jobs As Map";
_jobs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 5;BA.debugLine="Type DownloadData (url As String, Target As Objec";
;
 //BA.debugLineNum = 6;BA.debugLine="Type JobTag (Data As DownloadData,  _ 		CountingS";
;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public static String  _startdownload(lazaruz.win.downloadservice._downloaddata _data) throws Exception{
lazaruz.win.httpjob _j = null;
lazaruz.win.downloadservice._jobtag _tag = null;
 //BA.debugLineNum = 24;BA.debugLine="Public Sub StartDownload(data As DownloadData)";
 //BA.debugLineNum = 25;BA.debugLine="jobs.Initialize";
_jobs.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
_timer1.Initialize(ba,"timer1",(long) (1000));
 //BA.debugLineNum = 27;BA.debugLine="If jobs.ContainsKey(data.url) Then";
if (_jobs.ContainsKey((Object)(_data.url))) { 
 //BA.debugLineNum = 28;BA.debugLine="Log(\"Ignoring duplicate request.\")";
anywheresoftware.b4a.keywords.Common.Log("Ignoring duplicate request.");
 //BA.debugLineNum = 29;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 31;BA.debugLine="Dim J As HttpJob";
_j = new lazaruz.win.httpjob();
 //BA.debugLineNum = 32;BA.debugLine="J.Initialize(data.url, Me)";
_j._initialize(ba,_data.url,downloadservice.getObject());
 //BA.debugLineNum = 33;BA.debugLine="Dim tag As JobTag";
_tag = new lazaruz.win.downloadservice._jobtag();
 //BA.debugLineNum = 34;BA.debugLine="tag.Initialize";
_tag.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="tag.data = data";
_tag.Data = _data;
 //BA.debugLineNum = 36;BA.debugLine="J.tag = tag";
_j._tag = (Object)(_tag);
 //BA.debugLineNum = 37;BA.debugLine="jobs.Put(data.url, J)";
_jobs.Put((Object)(_data.url),(Object)(_j));
 //BA.debugLineNum = 38;BA.debugLine="J.Download(data.url)";
_j._download(_data.url);
 //BA.debugLineNum = 39;BA.debugLine="If timer1.Enabled = False Then StartTimer(data.Ta";
if (_timer1.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
_starttimer(_data.Target);};
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public static String  _starttimer(Object _target) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Private Sub StartTimer (Target As Object)";
 //BA.debugLineNum = 15;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
lazaruz.win.httpjob _job = null;
lazaruz.win.downloadservice._jobtag _jt = null;
 //BA.debugLineNum = 56;BA.debugLine="Sub timer1_tick";
 //BA.debugLineNum = 57;BA.debugLine="For Each job As HttpJob In jobs.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = _jobs.Values();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_job = (lazaruz.win.httpjob)(group1.Get(index1));
 //BA.debugLineNum = 58;BA.debugLine="Dim jt As JobTag = job.Tag";
_jt = (lazaruz.win.downloadservice._jobtag)(_job._tag);
 //BA.debugLineNum = 59;BA.debugLine="If jt.CountingStream.IsInitialized Then";
if (_jt.CountingStream.IsInitialized()) { 
 //BA.debugLineNum = 60;BA.debugLine="CallSub3(jt.Data.Target, jt.Data.EventName & \"_";
anywheresoftware.b4a.keywords.Common.CallSubNew3(ba,_jt.Data.Target,_jt.Data.EventName+"_Progress",(Object)(_jt.CountingStream.getCount()),(Object)(_jt.Total));
 };
 }
};
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
}
