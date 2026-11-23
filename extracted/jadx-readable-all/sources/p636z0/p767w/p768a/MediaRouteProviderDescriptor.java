package p636z0.p767w.p768a;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: z0.w.a.d, reason: use source file name */
/* JADX INFO: compiled from: MediaRouteProviderDescriptor.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaRouteProviderDescriptor {

    /* JADX INFO: renamed from: a */
    public final Bundle f38822a;

    /* JADX INFO: renamed from: b */
    public List<MediaRouteDescriptor> f38823b;

    public MediaRouteProviderDescriptor(Bundle bundle, List<MediaRouteDescriptor> list) {
        this.f38822a = bundle;
        this.f38823b = list;
    }

    /* JADX INFO: renamed from: a */
    public void m16805a() {
        if (this.f38823b == null) {
            ArrayList parcelableArrayList = this.f38822a.getParcelableArrayList("routes");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                this.f38823b = Collections.emptyList();
                return;
            }
            int size = parcelableArrayList.size();
            this.f38823b = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                List<MediaRouteDescriptor> list = this.f38823b;
                Bundle bundle = (Bundle) parcelableArrayList.get(i);
                MediaRouteDescriptor mediaRouteDescriptor = null;
                if (bundle != null) {
                    mediaRouteDescriptor = new MediaRouteDescriptor(bundle, null);
                }
                list.add(mediaRouteDescriptor);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m16806b() {
        m16805a();
        int size = this.f38823b.size();
        for (int i = 0; i < size; i++) {
            MediaRouteDescriptor mediaRouteDescriptor = this.f38823b.get(i);
            if (mediaRouteDescriptor == null || !mediaRouteDescriptor.m16787r()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteProviderDescriptor{ ");
        sb.append("routes=");
        m16805a();
        sb.append(Arrays.toString(this.f38823b.toArray()));
        sb.append(", isValid=");
        sb.append(m16806b());
        sb.append(" }");
        return sb.toString();
    }

    /* JADX INFO: renamed from: z0.w.a.d$a */
    /* JADX INFO: compiled from: MediaRouteProviderDescriptor.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Bundle f38824a;

        /* JADX INFO: renamed from: b */
        public ArrayList<MediaRouteDescriptor> f38825b;

        public a() {
            this.f38824a = new Bundle();
        }

        /* JADX INFO: renamed from: a */
        public a m16807a(MediaRouteDescriptor mediaRouteDescriptor) {
            if (mediaRouteDescriptor == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            ArrayList<MediaRouteDescriptor> arrayList = this.f38825b;
            if (arrayList == null) {
                this.f38825b = new ArrayList<>();
            } else if (arrayList.contains(mediaRouteDescriptor)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.f38825b.add(mediaRouteDescriptor);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public MediaRouteProviderDescriptor m16808b() {
            ArrayList<MediaRouteDescriptor> arrayList = this.f38825b;
            if (arrayList != null) {
                int size = arrayList.size();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add(this.f38825b.get(i).f38806a);
                }
                this.f38824a.putParcelableArrayList("routes", arrayList2);
            }
            return new MediaRouteProviderDescriptor(this.f38824a, this.f38825b);
        }

        public a(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            if (mediaRouteProviderDescriptor != null) {
                this.f38824a = new Bundle(mediaRouteProviderDescriptor.f38822a);
                mediaRouteProviderDescriptor.m16805a();
                if (mediaRouteProviderDescriptor.f38823b.isEmpty()) {
                    return;
                }
                this.f38825b = new ArrayList<>(mediaRouteProviderDescriptor.f38823b);
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
