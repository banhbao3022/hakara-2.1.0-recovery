package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0020a();

    /* JADX INFO: renamed from: f */
    public final String f40f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f41g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f42h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f43i;

    /* JADX INFO: renamed from: j */
    public final Bitmap f44j;

    /* JADX INFO: renamed from: k */
    public final Uri f45k;

    /* JADX INFO: renamed from: l */
    public final Bundle f46l;

    /* JADX INFO: renamed from: m */
    public final Uri f47m;

    /* JADX INFO: renamed from: n */
    public MediaDescription f48n;

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public class C0020a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m24a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0021b {

        /* JADX INFO: renamed from: a */
        public String f49a;

        /* JADX INFO: renamed from: b */
        public CharSequence f50b;

        /* JADX INFO: renamed from: c */
        public CharSequence f51c;

        /* JADX INFO: renamed from: d */
        public CharSequence f52d;

        /* JADX INFO: renamed from: e */
        public Bitmap f53e;

        /* JADX INFO: renamed from: f */
        public Uri f54f;

        /* JADX INFO: renamed from: g */
        public Bundle f55g;

        /* JADX INFO: renamed from: h */
        public Uri f56h;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f40f = str;
        this.f41g = charSequence;
        this.f42h = charSequence2;
        this.f43i = charSequence3;
        this.f44j = bitmap;
        this.f45k = uri;
        this.f46l = bundle;
        this.f47m = uri2;
    }

    /* JADX INFO: renamed from: a */
    public static MediaDescriptionCompat m24a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        C0021b c0021b = new C0021b();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c0021b.f49a = mediaDescription.getMediaId();
        c0021b.f50b = mediaDescription.getTitle();
        c0021b.f51c = mediaDescription.getSubtitle();
        c0021b.f52d = mediaDescription.getDescription();
        c0021b.f53e = mediaDescription.getIconBitmap();
        c0021b.f54f = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            extras = MediaSessionCompat.m41g(extras);
        }
        Uri uri = extras != null ? (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = extras;
        } else if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
            extras.remove("android.support.v4.media.description.MEDIA_URI");
            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = extras;
        }
        c0021b.f55g = bundle;
        if (uri != null) {
            c0021b.f56h = uri;
        } else if (i >= 23) {
            c0021b.f56h = mediaDescription.getMediaUri();
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(c0021b.f49a, c0021b.f50b, c0021b.f51c, c0021b.f52d, c0021b.f53e, c0021b.f54f, c0021b.f55g, c0021b.f56h);
        mediaDescriptionCompat.f48n = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f41g) + ", " + ((Object) this.f42h) + ", " + ((Object) this.f43i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionBuild = this.f48n;
        if (mediaDescriptionBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f40f);
            builder.setTitle(this.f41g);
            builder.setSubtitle(this.f42h);
            builder.setDescription(this.f43i);
            builder.setIconBitmap(this.f44j);
            builder.setIconUri(this.f45k);
            Bundle bundle = this.f46l;
            if (i2 < 23 && this.f47m != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f47m);
            }
            builder.setExtras(bundle);
            if (i2 >= 23) {
                builder.setMediaUri(this.f47m);
            }
            mediaDescriptionBuild = builder.build();
            this.f48n = mediaDescriptionBuild;
        }
        mediaDescriptionBuild.writeToParcel(parcel, i);
    }
}
