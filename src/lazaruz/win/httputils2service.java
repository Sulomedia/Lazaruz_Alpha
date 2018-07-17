package lazaruz.win;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class httputils2service extends Object{
public static httputils2service mostCurrent = new httputils2service();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("lazaruz.win", "lazaruz.win.httputils2service", null);
		ba.loadHtSubs(httputils2service.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "lazaruz.win.httputils2service", ba);
		}
	}
    public static Class<?> getObject() {
		return httputils2service.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.http.HttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public static lazaruz.win.main _main = null;
public static lazaruz.win.strings _strings = null;
public static lazaruz.win.downloadservice _downloadservice = null;
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
lazaruz.win.httpjob _job = null;
 //BA.debugLineNum = 69;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
 //BA.debugLineNum = 70;BA.debugLine="Dim job As HttpJob";
_job = new lazaruz.win.httpjob();
 //BA.debugLineNum = 71;BA.debugLine="job = TaskIdToJob.Get(TaskId)";
_job = (lazaruz.win.httpjob)(_taskidtojob.Get((Object)(_taskid)));
 //BA.debugLineNum = 72;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
 //BA.debugLineNum = 73;BA.debugLine="job.success = success";
_job._success = _success;
 //BA.debugLineNum = 74;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage = _errormessage;
 //BA.debugLineNum = 75;BA.debugLine="job.Complete(TaskId)";
_job._complete(_taskid);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4a.http.HttpClientWrapper.HttpResponeWrapper _response,String _reason,int _statuscode,int _taskid) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub hc_ResponseError (Response As HttpResponse, Re";
 //BA.debugLineNum = 58;BA.debugLine="If Response <> Null Then";
if (_response!= null) { 
 //BA.debugLineNum = 59;BA.debugLine="Try";
try { //BA.debugLineNum = 60;BA.debugLine="Log(Response.GetString(\"UTF8\"))";
anywheresoftware.b4a.keywords.Common.Log(_response.GetString("UTF8"));
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 62;BA.debugLine="Log(\"Failed to read error message.\")";
anywheresoftware.b4a.keywords.Common.Log("Failed to read error message.");
 };
 //BA.debugLineNum = 64;BA.debugLine="Response.Release";
_response.Release();
 };
 //BA.debugLineNum = 66;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4a.http.HttpClientWrapper.HttpResponeWrapper _response,int _taskid) throws Exception{
anywheresoftware.b4a.randomaccessfile.CountingStreams.CountingOutput _cs = null;
lazaruz.win.httpjob _j = null;
lazaruz.win.downloadservice._jobtag _jt = null;
 //BA.debugLineNum = 28;BA.debugLine="Sub hc_ResponseSuccess (Response As HttpResponse,";
 //BA.debugLineNum = 32;BA.debugLine="Dim cs As CountingOutputStream";
_cs = new anywheresoftware.b4a.randomaccessfile.CountingStreams.CountingOutput();
 //BA.debugLineNum = 33;BA.debugLine="cs.Initialize(File.OpenOutput(TempFolder, Task";
_cs.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False).getObject()));
 //BA.debugLineNum = 34;BA.debugLine="Dim j As HttpJob = TaskIdToJob.Get(TaskId)";
_j = (lazaruz.win.httpjob)(_taskidtojob.Get((Object)(_taskid)));
 //BA.debugLineNum = 35;BA.debugLine="If j.Tag Is JobTag Then";
if (_j._tag instanceof lazaruz.win.downloadservice._jobtag) { 
 //BA.debugLineNum = 36;BA.debugLine="Dim jt As JobTag = j.Tag";
_jt = (lazaruz.win.downloadservice._jobtag)(_j._tag);
 //BA.debugLineNum = 37;BA.debugLine="jt.CountingStream = cs";
_jt.CountingStream = _cs;
 //BA.debugLineNum = 38;BA.debugLine="jt.Total = Response.ContentLength";
_jt.Total = _response.getContentLength();
 //BA.debugLineNum = 39;BA.debugLine="If jt.Data.url = \"\" Then";
if ((_jt.Data.url).equals("")) { 
 //BA.debugLineNum = 40;BA.debugLine="Log(\"Job cancelled before downloaded sta";
anywheresoftware.b4a.keywords.Common.Log("Job cancelled before downloaded started");
 //BA.debugLineNum = 41;BA.debugLine="cs.Close";
_cs.Close();
 };
 };
 //BA.debugLineNum = 44;BA.debugLine="Response.GetAsynchronously(\"response\", cs , Tr";
_response.GetAsynchronously(ba,"response",(java.io.OutputStream)(_cs.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _initialize() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 11;BA.debugLine="TempFolder = File.DirTemp";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirTemp();
 //BA.debugLineNum = 12;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 //BA.debugLineNum = 13;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
 };
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private hc As HttpClient";
_hc = new anywheresoftware.b4a.http.HttpClientWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private TaskIdToJob As Map";
_taskidtojob = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5;BA.debugLine="Public TempFolder As String";
_tempfolder = "";
 //BA.debugLineNum = 6;BA.debugLine="Private taskCounter As Int";
_taskcounter = 0;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Response_StreamFinish (Success As Boolean, Tas";
 //BA.debugLineNum = 50;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 51;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
 //BA.debugLineNum = 53;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static int  _submitjob(lazaruz.win.httpjob _job) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub SubmitJob(job As HttpJob) As Int";
 //BA.debugLineNum = 18;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
 //BA.debugLineNum = 19;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
_taskidtojob.Put((Object)(_taskcounter),(Object)(_job));
 //BA.debugLineNum = 20;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username).equals("") == false && (_job._password).equals("") == false) { 
 //BA.debugLineNum = 21;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
_hc.ExecuteCredentials(ba,_job._getrequest(),_taskcounter,_job._username,_job._password);
 }else {
 //BA.debugLineNum = 23;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
_hc.Execute(ba,_job._getrequest(),_taskcounter);
 };
 //BA.debugLineNum = 25;BA.debugLine="Return taskCounter";
if (true) return _taskcounter;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return 0;
}
}
