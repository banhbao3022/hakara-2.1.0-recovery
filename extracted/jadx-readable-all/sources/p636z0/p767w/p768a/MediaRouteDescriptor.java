package p636z0.p767w.p768a;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.w.a.a, reason: use source file name */
/* JADX INFO: compiled from: MediaRouteDescriptor.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaRouteDescriptor {

    /* JADX INFO: renamed from: a */
    public final Bundle f38806a;

    /* JADX INFO: renamed from: b */
    public List<IntentFilter> f38807b;

    public MediaRouteDescriptor(Bundle bundle, List<IntentFilter> list) {
        this.f38806a = bundle;
        this.f38807b = list;
    }

    /* JADX INFO: renamed from: a */
    public void m16770a() {
        if (this.f38807b == null) {
            ArrayList parcelableArrayList = this.f38806a.getParcelableArrayList("controlFilters");
            this.f38807b = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f38807b = Collections.emptyList();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m16771b() {
        return this.f38806a.getInt("connectionState", 0);
    }

    /* JADX INFO: renamed from: c */
    public String m16772c() {
        return this.f38806a.getString("status");
    }

    /* JADX INFO: renamed from: d */
    public int m16773d() {
        return this.f38806a.getInt("deviceType");
    }

    /* JADX INFO: renamed from: e */
    public Bundle m16774e() {
        return this.f38806a.getBundle("extras");
    }

    /* JADX INFO: renamed from: f */
    public List<String> m16775f() {
        return this.f38806a.getStringArrayList("groupMemberIds");
    }

    /* JADX INFO: renamed from: g */
    public Uri m16776g() {
        String string = this.f38806a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* JADX INFO: renamed from: h */
    public String m16777h() {
        return this.f38806a.getString("id");
    }

    /* JADX INFO: renamed from: i */
    public String m16778i() {
        return this.f38806a.getString("name");
    }

    /* JADX INFO: renamed from: j */
    public int m16779j() {
        return this.f38806a.getInt("playbackStream", -1);
    }

    /* JADX INFO: renamed from: k */
    public int m16780k() {
        return this.f38806a.getInt("playbackType", 1);
    }

    /* JADX INFO: renamed from: l */
    public int m16781l() {
        return this.f38806a.getInt("presentationDisplayId", -1);
    }

    /* JADX INFO: renamed from: m */
    public int m16782m() {
        return this.f38806a.getInt("volume");
    }

    /* JADX INFO: renamed from: n */
    public int m16783n() {
        return this.f38806a.getInt("volumeHandling", 0);
    }

    /* JADX INFO: renamed from: o */
    public int m16784o() {
        return this.f38806a.getInt("volumeMax");
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public boolean m16785p() {
        return this.f38806a.getBoolean("connecting", false);
    }

    /* JADX INFO: renamed from: q */
    public boolean m16786q() {
        return this.f38806a.getBoolean("enabled", true);
    }

    /* JADX INFO: renamed from: r */
    public boolean m16787r() {
        m16770a();
        return (TextUtils.isEmpty(m16777h()) || TextUtils.isEmpty(m16778i()) || this.f38807b.contains(null)) ? false : true;
    }

    public String toString() {
        StringBuilder sbM1561L = outline.m1561L("MediaRouteDescriptor{ ", "id=");
        sbM1561L.append(m16777h());
        sbM1561L.append(", groupMemberIds=");
        sbM1561L.append(m16775f());
        sbM1561L.append(", name=");
        sbM1561L.append(m16778i());
        sbM1561L.append(", description=");
        sbM1561L.append(m16772c());
        sbM1561L.append(", iconUri=");
        sbM1561L.append(m16776g());
        sbM1561L.append(", isEnabled=");
        sbM1561L.append(m16786q());
        sbM1561L.append(", isConnecting=");
        sbM1561L.append(m16785p());
        sbM1561L.append(", connectionState=");
        sbM1561L.append(m16771b());
        sbM1561L.append(", controlFilters=");
        m16770a();
        sbM1561L.append(Arrays.toString(this.f38807b.toArray()));
        sbM1561L.append(", playbackType=");
        sbM1561L.append(m16780k());
        sbM1561L.append(", playbackStream=");
        sbM1561L.append(m16779j());
        sbM1561L.append(", deviceType=");
        sbM1561L.append(m16773d());
        sbM1561L.append(", volume=");
        sbM1561L.append(m16782m());
        sbM1561L.append(", volumeMax=");
        sbM1561L.append(m16784o());
        sbM1561L.append(", volumeHandling=");
        sbM1561L.append(m16783n());
        sbM1561L.append(", presentationDisplayId=");
        sbM1561L.append(m16781l());
        sbM1561L.append(", extras=");
        sbM1561L.append(m16774e());
        sbM1561L.append(", isValid=");
        sbM1561L.append(m16787r());
        sbM1561L.append(", minClientVersion=");
        sbM1561L.append(this.f38806a.getInt("minClientVersion", 1));
        sbM1561L.append(", maxClientVersion=");
        sbM1561L.append(this.f38806a.getInt("maxClientVersion", Integer.MAX_VALUE));
        sbM1561L.append(" }");
        return sbM1561L.toString();
    }

    /* JADX INFO: renamed from: z0.w.a.a$a */
    /* JADX INFO: compiled from: MediaRouteDescriptor.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Bundle f38808a;

        /* JADX INFO: renamed from: b */
        public ArrayList<IntentFilter> f38809b;

        public a(String str, String str2) {
            Bundle bundle = new Bundle();
            this.f38808a = bundle;
            bundle.putString("id", str);
            bundle.putString("name", str2);
        }

        /* JADX INFO: renamed from: a */
        public a m16788a(Collection<IntentFilter> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                for (IntentFilter intentFilter : collection) {
                    if (intentFilter == null) {
                        throw new IllegalArgumentException("filter must not be null");
                    }
                    if (this.f38809b == null) {
                        this.f38809b = new ArrayList<>();
                    }
                    if (!this.f38809b.contains(intentFilter)) {
                        this.f38809b.add(intentFilter);
                    }
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public MediaRouteDescriptor m16789b() {
            ArrayList<IntentFilter> arrayList = this.f38809b;
            if (arrayList != null) {
                this.f38808a.putParcelableArrayList("controlFilters", arrayList);
            }
            return new MediaRouteDescriptor(this.f38808a, this.f38809b);
        }

        /* JADX INFO: renamed from: c */
        public a m16790c(int i) {
            this.f38808a.putInt("volume", i);
            return this;
        }

        public a(MediaRouteDescriptor mediaRouteDescriptor) {
            if (mediaRouteDescriptor != null) {
                this.f38808a = new Bundle(mediaRouteDescriptor.f38806a);
                mediaRouteDescriptor.m16770a();
                if (mediaRouteDescriptor.f38807b.isEmpty()) {
                    return;
                }
                this.f38809b = new ArrayList<>(mediaRouteDescriptor.f38807b);
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
