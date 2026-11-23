package p636z0.p767w.p768a;

import android.os.Bundle;

/* JADX INFO: renamed from: z0.w.a.b, reason: use source file name */
/* JADX INFO: compiled from: MediaRouteDiscoveryRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaRouteDiscoveryRequest {

    /* JADX INFO: renamed from: a */
    public final Bundle f38810a;

    /* JADX INFO: renamed from: b */
    public MediaRouteSelector f38811b;

    public MediaRouteDiscoveryRequest(MediaRouteSelector mediaRouteSelector, boolean z) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f38810a = bundle;
        this.f38811b = mediaRouteSelector;
        bundle.putBundle("selector", mediaRouteSelector.f38827b);
        bundle.putBoolean("activeScan", z);
    }

    /* JADX INFO: renamed from: a */
    public final void m16791a() {
        if (this.f38811b == null) {
            MediaRouteSelector mediaRouteSelectorM16809b = MediaRouteSelector.m16809b(this.f38810a.getBundle("selector"));
            this.f38811b = mediaRouteSelectorM16809b;
            if (mediaRouteSelectorM16809b == null) {
                this.f38811b = MediaRouteSelector.f38826a;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m16792b() {
        return this.f38810a.getBoolean("activeScan");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaRouteDiscoveryRequest)) {
            return false;
        }
        MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = (MediaRouteDiscoveryRequest) obj;
        m16791a();
        MediaRouteSelector mediaRouteSelector = this.f38811b;
        mediaRouteDiscoveryRequest.m16791a();
        return mediaRouteSelector.equals(mediaRouteDiscoveryRequest.f38811b) && m16792b() == mediaRouteDiscoveryRequest.m16792b();
    }

    public int hashCode() {
        m16791a();
        return (this.f38811b.hashCode() ^ (m16792b() ? 1 : 0)) == true ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoveryRequest{ selector=");
        m16791a();
        sb.append(this.f38811b);
        sb.append(", activeScan=");
        sb.append(m16792b());
        sb.append(", isValid=");
        m16791a();
        MediaRouteSelector mediaRouteSelector = this.f38811b;
        mediaRouteSelector.m16810a();
        sb.append(!mediaRouteSelector.f38828c.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
