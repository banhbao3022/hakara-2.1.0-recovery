package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.vr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3632vr implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f20912f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f20913g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20914h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20915i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC3669wr f20916j;

    public RunnableC3632vr(AbstractC3669wr abstractC3669wr, String str, String str2, String str3, String str4) {
        this.f20916j = abstractC3669wr;
        this.f20912f = str;
        this.f20913g = str2;
        this.f20914h = str3;
        this.f20915i = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        HashMap map = new HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.f20912f);
        if (!TextUtils.isEmpty(this.f20913g)) {
            map.put("cachedSrc", this.f20913g);
        }
        switch (this.f20914h) {
            case "interrupted":
                b = 3;
                break;
            case "badUrl":
                b = 8;
                break;
            case "inProgress":
                b = 2;
                break;
            case "downloadTimeout":
                b = 9;
                break;
            case "contentLengthMissing":
                b = 0;
                break;
            case "playerFailed":
                b = 5;
                break;
            case "sizeExceeded":
                b = 11;
                break;
            case "externalAbort":
                b = 10;
                break;
            case "noop":
                b = 4;
                break;
            case "error":
                b = 1;
                break;
            case "expireFailed":
                b = 6;
                break;
            case "noCacheDir":
                b = 7;
                break;
            default:
                b = -1;
                break;
        }
        String str = "internal";
        switch (b) {
            case 6:
            case 7:
                str = "io";
                break;
            case 8:
            case 9:
                str = "network";
                break;
            case 10:
            case 11:
                str = "policy";
                break;
        }
        map.put("type", str);
        map.put("reason", this.f20914h);
        if (!TextUtils.isEmpty(this.f20915i)) {
            map.put("message", this.f20915i);
        }
        AbstractC3669wr.m8668p(this.f20916j, map);
    }
}
