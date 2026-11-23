package p636z0.p767w.p768a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: z0.w.a.e, reason: use source file name */
/* JADX INFO: compiled from: MediaRouteSelector.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaRouteSelector {

    /* JADX INFO: renamed from: a */
    public static final MediaRouteSelector f38826a = new MediaRouteSelector(new Bundle(), null);

    /* JADX INFO: renamed from: b */
    public final Bundle f38827b;

    /* JADX INFO: renamed from: c */
    public List<String> f38828c;

    /* JADX INFO: renamed from: z0.w.a.e$a */
    /* JADX INFO: compiled from: MediaRouteSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public ArrayList<String> f38829a;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public a m16811a(MediaRouteSelector mediaRouteSelector) {
            if (mediaRouteSelector == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            mediaRouteSelector.m16810a();
            List<String> list = mediaRouteSelector.f38828c;
            if (list == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!list.isEmpty()) {
                for (String str : list) {
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (this.f38829a == null) {
                        this.f38829a = new ArrayList<>();
                    }
                    if (!this.f38829a.contains(str)) {
                        this.f38829a.add(str);
                    }
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public MediaRouteSelector m16812b() {
            if (this.f38829a == null) {
                return MediaRouteSelector.f38826a;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.f38829a);
            return new MediaRouteSelector(bundle, this.f38829a);
        }

        public a(MediaRouteSelector mediaRouteSelector) {
            if (mediaRouteSelector == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            mediaRouteSelector.m16810a();
            if (mediaRouteSelector.f38828c.isEmpty()) {
                return;
            }
            this.f38829a = new ArrayList<>(mediaRouteSelector.f38828c);
        }
    }

    public MediaRouteSelector(Bundle bundle, List<String> list) {
        this.f38827b = bundle;
        this.f38828c = list;
    }

    /* JADX INFO: renamed from: b */
    public static MediaRouteSelector m16809b(Bundle bundle) {
        if (bundle != null) {
            return new MediaRouteSelector(bundle, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m16810a() {
        if (this.f38828c == null) {
            ArrayList<String> stringArrayList = this.f38827b.getStringArrayList("controlCategories");
            this.f38828c = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f38828c = Collections.emptyList();
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaRouteSelector)) {
            return false;
        }
        MediaRouteSelector mediaRouteSelector = (MediaRouteSelector) obj;
        m16810a();
        mediaRouteSelector.m16810a();
        return this.f38828c.equals(mediaRouteSelector.f38828c);
    }

    public int hashCode() {
        m16810a();
        return this.f38828c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteSelector{ ");
        sb.append("controlCategories=");
        m16810a();
        sb.append(Arrays.toString(this.f38828c.toArray()));
        sb.append(" }");
        return sb.toString();
    }
}
