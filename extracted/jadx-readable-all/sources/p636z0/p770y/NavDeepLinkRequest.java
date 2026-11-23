package p636z0.p770y;

import android.content.Intent;
import android.net.Uri;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.y.i, reason: use source file name */
/* JADX INFO: compiled from: NavDeepLinkRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class NavDeepLinkRequest {

    /* JADX INFO: renamed from: a */
    public final Uri f39028a;

    /* JADX INFO: renamed from: b */
    public final String f39029b;

    /* JADX INFO: renamed from: c */
    public final String f39030c;

    public NavDeepLinkRequest(Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f39028a = data;
        this.f39029b = action;
        this.f39030c = type;
    }

    public String toString() {
        StringBuilder sbM1561L = outline.m1561L("NavDeepLinkRequest", "{");
        if (this.f39028a != null) {
            sbM1561L.append(" uri=");
            sbM1561L.append(this.f39028a.toString());
        }
        if (this.f39029b != null) {
            sbM1561L.append(" action=");
            sbM1561L.append(this.f39029b);
        }
        if (this.f39030c != null) {
            sbM1561L.append(" mimetype=");
            sbM1561L.append(this.f39030c);
        }
        sbM1561L.append(" }");
        return sbM1561L.toString();
    }
}
