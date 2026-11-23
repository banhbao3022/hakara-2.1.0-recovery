package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p629y0.p630a.p632b.p633a.p634a.IMediaSession;
import p629y0.p630a.p632b.p635b.ResultReceiver;
import p636z0.p691g.ArrayMap;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* JADX INFO: renamed from: a */
    public static final boolean f16a = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: b */
    public final InterfaceC0012c f17b;

    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // p629y0.p630a.p632b.p635b.ResultReceiver
        /* JADX INFO: renamed from: a */
        public void mo9a(int i, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        @Override // p629y0.p630a.p632b.p635b.ResultReceiver
        /* JADX INFO: renamed from: a */
        public void mo9a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m41g(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        @Override // p629y0.p630a.p632b.p635b.ResultReceiver
        /* JADX INFO: renamed from: a */
        public void mo9a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m41g(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            Objects.requireNonNull(parcelableArray);
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class HandlerC0010a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<InterfaceC0016g> f20a;

        /* JADX INFO: renamed from: b */
        public WeakReference<Messenger> f21b;

        public HandlerC0010a(InterfaceC0016g interfaceC0016g) {
            this.f20a = new WeakReference<>(interfaceC0016g);
        }

        /* JADX INFO: renamed from: a */
        public void m12a(Messenger messenger) {
            this.f21b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f21b;
            if (weakReference == null || weakReference.get() == null || this.f20a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.m39a(data);
            InterfaceC0016g interfaceC0016g = this.f20a.get();
            Messenger messenger = this.f21b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m39a(bundle);
                    interfaceC0016g.mo19a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i == 2) {
                    interfaceC0016g.mo21c(messenger);
                } else if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m39a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.m39a(bundle3);
                    interfaceC0016g.mo20b(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    interfaceC0016g.mo21c(messenger);
                }
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0011b {

        /* JADX INFO: renamed from: a */
        public final MediaBrowser.ConnectionCallback f22a = new a();

        /* JADX INFO: renamed from: b */
        public b f23b;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                b bVar = C0011b.this.f23b;
                if (bVar != null) {
                    C0013d c0013d = (C0013d) bVar;
                    Objects.requireNonNull(c0013d);
                    try {
                        Bundle extras = c0013d.f26b.getExtras();
                        if (extras != null) {
                            extras.getInt("extra_service_version", 0);
                            IBinder binder = extras.getBinder("extra_messenger");
                            if (binder != null) {
                                c0013d.f30f = new C0017h(binder, c0013d.f27c);
                                Messenger messenger = new Messenger(c0013d.f28d);
                                c0013d.f31g = messenger;
                                c0013d.f28d.m12a(messenger);
                                try {
                                    C0017h c0017h = c0013d.f30f;
                                    Context context = c0013d.f25a;
                                    Messenger messenger2 = c0013d.f31g;
                                    Objects.requireNonNull(c0017h);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data_package_name", context.getPackageName());
                                    bundle.putInt("data_calling_pid", Process.myPid());
                                    bundle.putBundle("data_root_hints", c0017h.f34b);
                                    c0017h.m22a(6, bundle, messenger2);
                                } catch (RemoteException unused) {
                                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            }
                            IMediaSession iMediaSessionM14489E0 = IMediaSession.a.m14489E0(extras.getBinder("extra_session_binder"));
                            if (iMediaSessionM14489E0 != null) {
                                c0013d.f32h = MediaSessionCompat.Token.m46a(c0013d.f26b.getSessionToken(), iMediaSessionM14489E0);
                            }
                        }
                    } catch (IllegalStateException e) {
                        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
                    }
                }
                C0011b.this.mo13a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                b bVar = C0011b.this.f23b;
                if (bVar != null) {
                    Objects.requireNonNull((C0013d) bVar);
                }
                C0011b.this.mo14b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                b bVar = C0011b.this.f23b;
                if (bVar != null) {
                    C0013d c0013d = (C0013d) bVar;
                    c0013d.f30f = null;
                    c0013d.f31g = null;
                    c0013d.f32h = null;
                    c0013d.f28d.m12a(null);
                }
                C0011b.this.mo15c();
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        public interface b {
        }

        /* JADX INFO: renamed from: a */
        public void mo13a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo14b() {
        }

        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public interface InterfaceC0012c {
        /* JADX INFO: renamed from: J */
        void mo16J();

        /* JADX INFO: renamed from: K */
        void mo17K();

        /* JADX INFO: renamed from: L */
        MediaSessionCompat.Token mo18L();
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static class C0013d implements InterfaceC0012c, InterfaceC0016g, C0011b.b {

        /* JADX INFO: renamed from: a */
        public final Context f25a;

        /* JADX INFO: renamed from: b */
        public final MediaBrowser f26b;

        /* JADX INFO: renamed from: c */
        public final Bundle f27c;

        /* JADX INFO: renamed from: d */
        public final HandlerC0010a f28d = new HandlerC0010a(this);

        /* JADX INFO: renamed from: e */
        public final ArrayMap<String, C0018i> f29e = new ArrayMap<>();

        /* JADX INFO: renamed from: f */
        public C0017h f30f;

        /* JADX INFO: renamed from: g */
        public Messenger f31g;

        /* JADX INFO: renamed from: h */
        public MediaSessionCompat.Token f32h;

        public C0013d(Context context, ComponentName componentName, C0011b c0011b, Bundle bundle) {
            this.f25a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f27c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            c0011b.f23b = this;
            this.f26b = new MediaBrowser(context, componentName, c0011b.f22a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0012c
        /* JADX INFO: renamed from: J */
        public void mo16J() {
            Messenger messenger;
            C0017h c0017h = this.f30f;
            if (c0017h != null && (messenger = this.f31g) != null) {
                try {
                    c0017h.m22a(7, null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f26b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0012c
        /* JADX INFO: renamed from: K */
        public void mo17K() {
            this.f26b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0012c
        /* JADX INFO: renamed from: L */
        public MediaSessionCompat.Token mo18L() {
            if (this.f32h == null) {
                this.f32h = MediaSessionCompat.Token.m46a(this.f26b.getSessionToken(), null);
            }
            return this.f32h;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0016g
        /* JADX INFO: renamed from: a */
        public void mo19a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0016g
        /* JADX INFO: renamed from: b */
        public void mo20b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f31g != messenger) {
                return;
            }
            C0018i orDefault = this.f29e.getOrDefault(str, null);
            if (orDefault != null) {
                orDefault.m23a(bundle);
            } else if (MediaBrowserCompat.f16a) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0016g
        /* JADX INFO: renamed from: c */
        public void mo21c(Messenger messenger) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public static class C0014e extends C0013d {
        public C0014e(Context context, ComponentName componentName, C0011b c0011b, Bundle bundle) {
            super(context, componentName, c0011b, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public static class C0015f extends C0014e {
        public C0015f(Context context, ComponentName componentName, C0011b c0011b, Bundle bundle) {
            super(context, componentName, c0011b, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$g */
    public interface InterfaceC0016g {
        /* JADX INFO: renamed from: a */
        void mo19a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* JADX INFO: renamed from: b */
        void mo20b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* JADX INFO: renamed from: c */
        void mo21c(Messenger messenger);
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public static class C0017h {

        /* JADX INFO: renamed from: a */
        public Messenger f33a;

        /* JADX INFO: renamed from: b */
        public Bundle f34b;

        public C0017h(IBinder iBinder, Bundle bundle) {
            this.f33a = new Messenger(iBinder);
            this.f34b = bundle;
        }

        /* JADX INFO: renamed from: a */
        public final void m22a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f33a.send(messageObtain);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$i */
    public static class C0018i {

        /* JADX INFO: renamed from: a */
        public final List<AbstractC0019j> f35a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<Bundle> f36b = new ArrayList();

        /* JADX INFO: renamed from: a */
        public AbstractC0019j m23a(Bundle bundle) {
            for (int i = 0; i < this.f36b.size(); i++) {
                Bundle bundle2 = this.f36b.get(i);
                boolean z = true;
                if (bundle2 != bundle && (bundle2 != null ? bundle != null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) != bundle.getInt("android.media.browse.extra.PAGE", -1) || bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) : bundle2.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1)) {
                    z = false;
                }
                if (z) {
                    return this.f35a.get(i);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public static abstract class AbstractC0019j {

        /* JADX INFO: renamed from: a */
        public final IBinder f37a = new Binder();

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$j$a */
        public class a extends MediaBrowser.SubscriptionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                Objects.requireNonNull(AbstractC0019j.this);
                AbstractC0019j abstractC0019j = AbstractC0019j.this;
                MediaItem.m11b(list);
                Objects.requireNonNull(abstractC0019j);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                Objects.requireNonNull(AbstractC0019j.this);
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$j$b */
        public class b extends a {
            public b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.m39a(bundle);
                AbstractC0019j abstractC0019j = AbstractC0019j.this;
                MediaItem.m11b(list);
                Objects.requireNonNull(abstractC0019j);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.m39a(bundle);
                Objects.requireNonNull(AbstractC0019j.this);
            }
        }

        public AbstractC0019j() {
            if (Build.VERSION.SDK_INT >= 26) {
                new b();
            } else {
                new a();
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0011b c0011b, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f17b = new C0015f(context, componentName, c0011b, bundle);
        } else if (i >= 23) {
            this.f17b = new C0014e(context, componentName, c0011b, bundle);
        } else {
            this.f17b = new C0013d(context, componentName, c0011b, bundle);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0009a();

        /* JADX INFO: renamed from: f */
        public final int f18f;

        /* JADX INFO: renamed from: g */
        public final MediaDescriptionCompat f19g;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public class C0009a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.f40f)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f18f = i;
            this.f19g = mediaDescriptionCompat;
        }

        /* JADX INFO: renamed from: a */
        public static MediaItem m10a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m24a(mediaItem.getDescription()), mediaItem.getFlags());
        }

        /* JADX INFO: renamed from: b */
        public static List<MediaItem> m11b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m10a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f18f + ", mDescription=" + this.f19g + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f18f);
            this.f19g.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f18f = parcel.readInt();
            this.f19g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
