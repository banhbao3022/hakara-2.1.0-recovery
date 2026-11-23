package p007c.p165l.p166h0.p168c0;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.util.Objects;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p166h0.p168c0.p169p.ViewHierarchy;

/* JADX INFO: renamed from: c.l.h0.c0.j, reason: use source file name */
/* JADX INFO: compiled from: ViewIndexer.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewIndexer extends TimerTask {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewIndexer5 f4654f;

    public ViewIndexer(ViewIndexer5 viewIndexer5) {
        this.f4654f = viewIndexer5;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            Activity activity = this.f4654f.f4661c.get();
            if (activity == null) {
                return;
            }
            String simpleName = activity.getClass().getSimpleName();
            View rootView = activity.getWindow().getDecorView().getRootView();
            if (CodelessManager3.f4630f.booleanValue()) {
                FutureTask futureTask = new FutureTask(new ViewIndexer5.a(rootView));
                this.f4654f.f4660b.post(futureTask);
                String str = "";
                try {
                    str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                } catch (Exception e) {
                    Log.e(ViewIndexer5.f4659a, "Failed to take screenshot.", e);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("screenname", simpleName);
                    jSONObject.put("screenshot", str);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(ViewHierarchy.m2299c(rootView));
                    jSONObject.put("view", jSONArray);
                } catch (JSONException unused) {
                    Log.e(ViewIndexer5.f4659a, "Failed to create JSONObject");
                }
                String string = jSONObject.toString();
                ViewIndexer5 viewIndexer5 = this.f4654f;
                Objects.requireNonNull(viewIndexer5);
                FacebookSdk.m2660b().execute(new ViewIndexer3(viewIndexer5, string));
            }
        } catch (Exception e2) {
            Log.e(ViewIndexer5.f4659a, "UI Component tree indexing failure!", e2);
        }
    }
}
