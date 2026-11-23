package p007c.p165l.p166h0.p174h0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.HashSet;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p172f0.ModelManager4;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.h0.g, reason: use source file name */
/* JADX INFO: compiled from: ViewOnClickListener.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListener2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ JSONObject f4821f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f4822g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f4823h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewOnClickListener3 f4824i;

    public ViewOnClickListener2(ViewOnClickListener3 viewOnClickListener3, JSONObject jSONObject, String str, String str2) {
        this.f4824i = viewOnClickListener3;
        this.f4821f = jSONObject;
        this.f4822g = str;
        this.f4823h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string;
        String strM2334c;
        try {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            Context context = FacebookSdk.f5360i;
            try {
                Validate.m2479h();
                string = FacebookSdk.f5355d;
                if (string == null) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i = applicationInfo.labelRes;
                    string = i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
                }
            } catch (Exception unused) {
                string = "";
            }
            String lowerCase = string.toLowerCase();
            float[] fArrM2335a = FeatureExtractor.m2335a(this.f4821f, lowerCase);
            String str = this.f4822g;
            String lowerCase2 = (lowerCase + " | " + this.f4824i.f4829j + ", " + str).toLowerCase();
            if (fArrM2335a == null || (strM2334c = ModelManager4.m2334c("SUGGEST_EVENT", fArrM2335a, lowerCase2)) == null) {
                return;
            }
            PredictionHistoryManager.m2346a(this.f4823h, strM2334c);
            if (strM2334c.equals("other")) {
                return;
            }
            ViewOnClickListener3.m2356a(strM2334c, this.f4822g, fArrM2335a);
        } catch (Exception unused2) {
        }
    }
}
