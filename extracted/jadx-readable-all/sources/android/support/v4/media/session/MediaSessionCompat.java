package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.session.MediaButtonReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback;
import p629y0.p630a.p632b.p633a.p634a.IMediaSession;
import p636z0.p692g0.VersionedParcelable;
import p636z0.p765v.MediaSessionManager;
import p636z0.p765v.VolumeProviderCompat;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {

    /* JADX INFO: renamed from: a */
    public static final int f75a;

    /* JADX INFO: renamed from: b */
    public static int f76b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0033c f77c;

    /* JADX INFO: renamed from: d */
    public final MediaControllerCompat f78d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<InterfaceC0037g> f79e;

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0028a();

        /* JADX INFO: renamed from: f */
        public final MediaDescriptionCompat f80f;

        /* JADX INFO: renamed from: g */
        public final long f81g;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public class C0028a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j2) {
            this(null, mediaDescriptionCompat, j2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("MediaSession.QueueItem {Description=");
            sbM1556G.append(this.f80f);
            sbM1556G.append(", Id=");
            sbM1556G.append(this.f81g);
            sbM1556G.append(" }");
            return sbM1556G.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f80f.writeToParcel(parcel, i);
            parcel.writeLong(this.f81g);
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j2 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f80f = mediaDescriptionCompat;
            this.f81g = j2;
        }

        public QueueItem(Parcel parcel) {
            this.f80f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f81g = parcel.readLong();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0030a();

        /* JADX INFO: renamed from: f */
        public final Object f83f = new Object();

        /* JADX INFO: renamed from: g */
        public final Object f84g;

        /* JADX INFO: renamed from: h */
        public IMediaSession f85h;

        /* JADX INFO: renamed from: i */
        public VersionedParcelable f86i;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public class C0030a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null, null);
            }

            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj, IMediaSession iMediaSession, VersionedParcelable versionedParcelable) {
            this.f84g = obj;
            this.f85h = iMediaSession;
            this.f86i = versionedParcelable;
        }

        /* JADX INFO: renamed from: a */
        public static Token m46a(Object obj, IMediaSession iMediaSession) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, iMediaSession, null);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        /* JADX INFO: renamed from: b */
        public IMediaSession m47b() {
            IMediaSession iMediaSession;
            synchronized (this.f83f) {
                iMediaSession = this.f85h;
            }
            return iMediaSession;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f84g;
            if (obj2 == null) {
                return token.f84g == null;
            }
            Object obj3 = token.f84g;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f84g;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f84g, i);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public class C0031a extends AbstractC0032b {
        public C0031a(MediaSessionCompat mediaSessionCompat) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public static abstract class AbstractC0032b {

        /* JADX INFO: renamed from: c */
        public boolean f89c;

        /* JADX INFO: renamed from: e */
        public a f91e;

        /* JADX INFO: renamed from: a */
        public final Object f87a = new Object();

        /* JADX INFO: renamed from: b */
        public final MediaSession.Callback f88b = new b();

        /* JADX INFO: renamed from: d */
        public WeakReference<InterfaceC0033c> f90d = new WeakReference<>(null);

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$b$a */
        public class a extends Handler {
            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                InterfaceC0033c interfaceC0033c;
                AbstractC0032b abstractC0032b;
                a aVar;
                if (message.what == 1) {
                    synchronized (AbstractC0032b.this.f87a) {
                        interfaceC0033c = AbstractC0032b.this.f90d.get();
                        abstractC0032b = AbstractC0032b.this;
                        aVar = abstractC0032b.f91e;
                    }
                    if (interfaceC0033c == null || abstractC0032b != interfaceC0033c.mo63e() || aVar == null) {
                        return;
                    }
                    interfaceC0033c.mo68j((MediaSessionManager) message.obj);
                    AbstractC0032b.this.m48b(interfaceC0033c, aVar);
                    interfaceC0033c.mo68j(null);
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$b$b */
        public class b extends MediaSession.Callback {
            public b() {
            }

            /* JADX INFO: renamed from: a */
            public final C0034d m55a() {
                C0034d c0034d;
                AbstractC0032b abstractC0032b;
                synchronized (AbstractC0032b.this.f87a) {
                    c0034d = (C0034d) AbstractC0032b.this.f90d.get();
                }
                if (c0034d != null) {
                    AbstractC0032b abstractC0032b2 = AbstractC0032b.this;
                    synchronized (c0034d.f96c) {
                        abstractC0032b = c0034d.f102i;
                    }
                    if (abstractC0032b2 == abstractC0032b) {
                        return c0034d;
                    }
                }
                return null;
            }

            /* JADX INFO: renamed from: b */
            public final void m56b(InterfaceC0033c interfaceC0033c) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String strM72n = ((C0034d) interfaceC0033c).m72n();
                if (TextUtils.isEmpty(strM72n)) {
                    strM72n = "android.media.session.MediaController";
                }
                interfaceC0033c.mo68j(new MediaSessionManager(strM72n, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                VersionedParcelable versionedParcelable;
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                MediaSessionCompat.m39a(bundle);
                m56b(c0034dM55a);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = c0034dM55a.f95b;
                        IMediaSession iMediaSessionM47b = token.m47b();
                        bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", iMediaSessionM47b == null ? null : iMediaSessionM47b.asBinder());
                        synchronized (token.f83f) {
                            versionedParcelable = token.f86i;
                        }
                        if (versionedParcelable != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(versionedParcelable));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        AbstractC0032b abstractC0032b = AbstractC0032b.this;
                        Objects.requireNonNull(abstractC0032b);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        AbstractC0032b abstractC0032b2 = AbstractC0032b.this;
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        Objects.requireNonNull(abstractC0032b2);
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        AbstractC0032b abstractC0032b3 = AbstractC0032b.this;
                        Objects.requireNonNull(abstractC0032b3);
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        Objects.requireNonNull(AbstractC0032b.this);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                MediaSessionCompat.m39a(bundle);
                m56b(c0034dM55a);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        MediaSessionCompat.m39a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        MediaSessionCompat.m39a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        MediaSessionCompat.m39a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        MediaSessionCompat.m39a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        MediaSessionCompat.m39a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        Objects.requireNonNull(AbstractC0032b.this);
                    } else {
                        Objects.requireNonNull(AbstractC0032b.this);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return false;
                }
                m56b(c0034dM55a);
                boolean zMo49c = AbstractC0032b.this.mo49c(intent);
                c0034dM55a.mo68j(null);
                return zMo49c || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                AbstractC0032b.this.mo50d();
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                AbstractC0032b.this.mo51e();
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                MediaSessionCompat.m39a(bundle);
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                MediaSessionCompat.m39a(bundle);
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                MediaSessionCompat.m39a(bundle);
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                MediaSessionCompat.m39a(bundle);
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                MediaSessionCompat.m39a(bundle);
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                MediaSessionCompat.m39a(bundle);
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j2) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                AbstractC0032b abstractC0032b = AbstractC0032b.this;
                RatingCompat.m29a(rating);
                Objects.requireNonNull(abstractC0032b);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                AbstractC0032b.this.mo52f();
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                AbstractC0032b.this.mo53g();
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j2) {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                C0034d c0034dM55a = m55a();
                if (c0034dM55a == null) {
                    return;
                }
                m56b(c0034dM55a);
                Objects.requireNonNull(AbstractC0032b.this);
                c0034dM55a.mo68j(null);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m48b(InterfaceC0033c interfaceC0033c, Handler handler) {
            if (this.f89c) {
                this.f89c = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackStateCompatMo58P = interfaceC0033c.mo58P();
                long j2 = playbackStateCompatMo58P == null ? 0L : playbackStateCompatMo58P.f114j;
                boolean z = playbackStateCompatMo58P != null && playbackStateCompatMo58P.f110f == 3;
                boolean z2 = (516 & j2) != 0;
                boolean z3 = (j2 & 514) != 0;
                if (z && z3) {
                    mo50d();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    mo51e();
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean mo49c(Intent intent) {
            InterfaceC0033c interfaceC0033c;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f87a) {
                interfaceC0033c = this.f90d.get();
                aVar = this.f91e;
            }
            if (interfaceC0033c == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            MediaSessionManager mediaSessionManagerMo71m = interfaceC0033c.mo71m();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                m48b(interfaceC0033c, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                m48b(interfaceC0033c, aVar);
            } else if (this.f89c) {
                aVar.removeMessages(1);
                this.f89c = false;
                PlaybackStateCompat playbackStateCompatMo58P = interfaceC0033c.mo58P();
                if (((playbackStateCompatMo58P == null ? 0L : playbackStateCompatMo58P.f114j) & 32) != 0) {
                    mo52f();
                }
            } else {
                this.f89c = true;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, mediaSessionManagerMo71m), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        /* JADX INFO: renamed from: d */
        public void mo50d() {
        }

        /* JADX INFO: renamed from: e */
        public void mo51e() {
        }

        /* JADX INFO: renamed from: f */
        public void mo52f() {
        }

        /* JADX INFO: renamed from: g */
        public void mo53g() {
        }

        /* JADX INFO: renamed from: h */
        public void m54h(InterfaceC0033c interfaceC0033c, Handler handler) {
            synchronized (this.f87a) {
                this.f90d = new WeakReference<>(interfaceC0033c);
                a aVar = this.f91e;
                a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages(null);
                }
                if (interfaceC0033c != null && handler != null) {
                    aVar2 = new a(handler.getLooper());
                }
                this.f91e = aVar2;
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    public interface InterfaceC0033c {
        /* JADX INFO: renamed from: L */
        Token mo57L();

        /* JADX INFO: renamed from: P */
        PlaybackStateCompat mo58P();

        /* JADX INFO: renamed from: a */
        boolean mo59a();

        /* JADX INFO: renamed from: b */
        void mo60b(PendingIntent pendingIntent);

        /* JADX INFO: renamed from: c */
        void mo61c(AbstractC0032b abstractC0032b, Handler handler);

        /* JADX INFO: renamed from: d */
        void mo62d(int i);

        /* JADX INFO: renamed from: e */
        AbstractC0032b mo63e();

        /* JADX INFO: renamed from: f */
        void mo64f(MediaMetadataCompat mediaMetadataCompat);

        /* JADX INFO: renamed from: g */
        void mo65g(PendingIntent pendingIntent);

        /* JADX INFO: renamed from: h */
        void mo66h(int i);

        /* JADX INFO: renamed from: i */
        void mo67i(boolean z);

        /* JADX INFO: renamed from: j */
        void mo68j(MediaSessionManager mediaSessionManager);

        /* JADX INFO: renamed from: k */
        void mo69k(PlaybackStateCompat playbackStateCompat);

        /* JADX INFO: renamed from: l */
        void mo70l(VolumeProviderCompat volumeProviderCompat);

        /* JADX INFO: renamed from: m */
        MediaSessionManager mo71m();

        void release();
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    public static class C0034d implements InterfaceC0033c {

        /* JADX INFO: renamed from: a */
        public final MediaSession f94a;

        /* JADX INFO: renamed from: b */
        public final Token f95b;

        /* JADX INFO: renamed from: d */
        public Bundle f97d;

        /* JADX INFO: renamed from: g */
        public PlaybackStateCompat f100g;

        /* JADX INFO: renamed from: h */
        public MediaMetadataCompat f101h;

        /* JADX INFO: renamed from: i */
        public AbstractC0032b f102i;

        /* JADX INFO: renamed from: j */
        public MediaSessionManager f103j;

        /* JADX INFO: renamed from: c */
        public final Object f96c = new Object();

        /* JADX INFO: renamed from: e */
        public boolean f98e = false;

        /* JADX INFO: renamed from: f */
        public final RemoteCallbackList<IMediaControllerCallback> f99f = new RemoteCallbackList<>();

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$d$a */
        public class a extends IMediaSession.a {
            public a() {
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: A1 */
            public void mo73A1(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: A5 */
            public int mo74A5() {
                Objects.requireNonNull(C0034d.this);
                return 0;
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: B1 */
            public boolean mo75B1() {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: C4 */
            public boolean mo76C4() {
                Objects.requireNonNull(C0034d.this);
                return false;
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: D1 */
            public void mo77D1(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: E2 */
            public void mo78E2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: E3 */
            public void mo79E3(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: F1 */
            public PendingIntent mo80F1() {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: F5 */
            public void mo81F5(long j2) {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: G5 */
            public void mo82G5(boolean z) throws RemoteException {
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: H3 */
            public void mo83H3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: J2 */
            public void mo84J2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: J5 */
            public ParcelableVolumeInfo mo85J5() {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: K1 */
            public int mo86K1() {
                Objects.requireNonNull(C0034d.this);
                return 0;
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: L2 */
            public void mo87L2() throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: L3 */
            public void mo88L3(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: M1 */
            public void mo89M1(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: N5 */
            public Bundle mo90N5() {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: O2 */
            public void mo91O2(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: P */
            public PlaybackStateCompat mo92P() {
                C0034d c0034d = C0034d.this;
                return MediaSessionCompat.m40c(c0034d.f100g, c0034d.f101h);
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: R3 */
            public void mo93R3(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: T0 */
            public void mo94T0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: U */
            public void mo95U() throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: V5 */
            public void mo96V5(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: Y4 */
            public void mo97Y4(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: a5 */
            public List<QueueItem> mo98a5() {
                return null;
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: b1 */
            public void mo99b1(IMediaControllerCallback iMediaControllerCallback) {
                if (C0034d.this.f98e) {
                    return;
                }
                C0034d.this.f99f.register(iMediaControllerCallback, new MediaSessionManager("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: h5 */
            public void mo100h5() throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: k2 */
            public CharSequence mo101k2() {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: l1 */
            public boolean mo102l1() {
                return false;
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: m1 */
            public void mo103m1(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: m6 */
            public String mo104m6() {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: o3 */
            public void mo105o3(float f) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: p4 */
            public int mo106p4() {
                Objects.requireNonNull(C0034d.this);
                return 0;
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: q1 */
            public void mo107q1(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: r1 */
            public void mo108r1(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: r2 */
            public MediaMetadataCompat mo109r2() {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: s2 */
            public void mo110s2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            public void setRepeatMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: t3 */
            public boolean mo111t3(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: w0 */
            public String mo112w0() {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: w5 */
            public long mo113w5() {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: x */
            public void mo114x(long j2) throws RemoteException {
                throw new AssertionError();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: x2 */
            public Bundle mo115x2() {
                if (C0034d.this.f97d == null) {
                    return null;
                }
                return new Bundle(C0034d.this.f97d);
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: y2 */
            public void mo116y2(IMediaControllerCallback iMediaControllerCallback) {
                C0034d.this.f99f.unregister(iMediaControllerCallback);
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: z4 */
            public void mo117z4(int i) {
                throw new AssertionError();
            }
        }

        public C0034d(MediaSession mediaSession, VersionedParcelable versionedParcelable, Bundle bundle) {
            this.f94a = mediaSession;
            this.f95b = new Token(mediaSession.getSessionToken(), new a(), versionedParcelable);
            this.f97d = bundle;
            mediaSession.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: L */
        public Token mo57L() {
            return this.f95b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: P */
        public PlaybackStateCompat mo58P() {
            return this.f100g;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: a */
        public boolean mo59a() {
            return this.f94a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: b */
        public void mo60b(PendingIntent pendingIntent) {
            this.f94a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: c */
        public void mo61c(AbstractC0032b abstractC0032b, Handler handler) {
            synchronized (this.f96c) {
                this.f102i = abstractC0032b;
                this.f94a.setCallback(abstractC0032b == null ? null : abstractC0032b.f88b, handler);
                if (abstractC0032b != null) {
                    abstractC0032b.m54h(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: d */
        public void mo62d(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.f94a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: e */
        public AbstractC0032b mo63e() {
            AbstractC0032b abstractC0032b;
            synchronized (this.f96c) {
                abstractC0032b = this.f102i;
            }
            return abstractC0032b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: f */
        public void mo64f(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f101h = mediaMetadataCompat;
            MediaSession mediaSession = this.f94a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                if (mediaMetadataCompat.f59h == null) {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeBundle(mediaMetadataCompat.f58g);
                    parcelObtain.setDataPosition(0);
                    mediaMetadataCompat.f59h = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                }
                mediaMetadata = mediaMetadataCompat.f59h;
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: g */
        public void mo65g(PendingIntent pendingIntent) {
            this.f94a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: h */
        public void mo66h(int i) {
            this.f94a.setFlags(i | 1 | 2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: i */
        public void mo67i(boolean z) {
            this.f94a.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: j */
        public void mo68j(MediaSessionManager mediaSessionManager) {
            synchronized (this.f96c) {
                this.f103j = mediaSessionManager;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: k */
        public void mo69k(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f100g = playbackStateCompat;
            for (int iBeginBroadcast = this.f99f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.f99f.getBroadcastItem(iBeginBroadcast)).mo38w6(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f99f.finishBroadcast();
            MediaSession mediaSession = this.f94a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                if (playbackStateCompat.f121q == null) {
                    PlaybackState.Builder builder = new PlaybackState.Builder();
                    builder.setState(playbackStateCompat.f110f, playbackStateCompat.f111g, playbackStateCompat.f113i, playbackStateCompat.f117m);
                    builder.setBufferedPosition(playbackStateCompat.f112h);
                    builder.setActions(playbackStateCompat.f114j);
                    builder.setErrorMessage(playbackStateCompat.f116l);
                    for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f118n) {
                        PlaybackState.CustomAction customActionBuild = customAction.f126j;
                        if (customActionBuild == null) {
                            PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(customAction.f122f, customAction.f123g, customAction.f124h);
                            builder2.setExtras(customAction.f125i);
                            customActionBuild = builder2.build();
                        }
                        builder.addCustomAction(customActionBuild);
                    }
                    builder.setActiveQueueItemId(playbackStateCompat.f119o);
                    if (Build.VERSION.SDK_INT >= 22) {
                        builder.setExtras(playbackStateCompat.f120p);
                    }
                    playbackStateCompat.f121q = builder.build();
                }
                playbackState = playbackStateCompat.f121q;
            }
            mediaSession.setPlaybackState(playbackState);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: l */
        public void mo70l(VolumeProviderCompat volumeProviderCompat) {
            this.f94a.setPlaybackToRemote((VolumeProvider) volumeProviderCompat.m16766a());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: m */
        public MediaSessionManager mo71m() {
            MediaSessionManager mediaSessionManager;
            synchronized (this.f96c) {
                mediaSessionManager = this.f103j;
            }
            return mediaSessionManager;
        }

        /* JADX INFO: renamed from: n */
        public String m72n() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f94a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f94a, new Object[0]);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        public void release() {
            this.f98e = true;
            this.f99f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f94a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f94a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            this.f94a.setCallback(null);
            this.f94a.release();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    public static class C0035e extends C0034d {
        public C0035e(MediaSession mediaSession, VersionedParcelable versionedParcelable, Bundle bundle) {
            super(mediaSession, versionedParcelable, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0034d, android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: j */
        public void mo68j(MediaSessionManager mediaSessionManager) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0034d, android.support.v4.media.session.MediaSessionCompat.InterfaceC0033c
        /* JADX INFO: renamed from: m */
        public final MediaSessionManager mo71m() {
            return new MediaSessionManager(this.f94a.getCurrentControllerInfo());
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    public static class C0036f extends C0035e {
        public C0036f(MediaSession mediaSession, VersionedParcelable versionedParcelable, Bundle bundle) {
            super(mediaSession, versionedParcelable, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    public interface InterfaceC0037g {
        /* JADX INFO: renamed from: a */
        void mo118a();
    }

    static {
        f75a = Build.VERSION.CODENAME.equals("S") ? 33554432 : 0;
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m39a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* JADX INFO: renamed from: c */
    public static PlaybackStateCompat m40c(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        if (playbackStateCompat.f111g == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.f110f;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        long j3 = playbackStateCompat.f117m;
        long j4 = 0;
        if (j3 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = ((long) (playbackStateCompat.f113i * (jElapsedRealtime - j3))) + playbackStateCompat.f111g;
        if (mediaMetadataCompat != null && mediaMetadataCompat.f58g.containsKey("android.media.metadata.DURATION")) {
            j2 = mediaMetadataCompat.f58g.getLong("android.media.metadata.DURATION", 0L);
        }
        if (j2 >= 0 && j5 > j2) {
            j4 = j2;
        } else if (j5 >= 0) {
            j4 = j5;
        }
        PlaybackStateCompat.C0041b c0041b = new PlaybackStateCompat.C0041b(playbackStateCompat);
        int i2 = playbackStateCompat.f110f;
        float f = playbackStateCompat.f113i;
        c0041b.f128b = i2;
        c0041b.f129c = j4;
        c0041b.f135i = jElapsedRealtime;
        c0041b.f131e = f;
        return c0041b.m119a();
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m41g(Bundle bundle) {
        m39a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public Token m42b() {
        return this.f77c.mo57L();
    }

    /* JADX INFO: renamed from: d */
    public boolean m43d() {
        return this.f77c.mo59a();
    }

    /* JADX INFO: renamed from: e */
    public void m44e(boolean z) {
        this.f77c.mo67i(z);
        Iterator<InterfaceC0037g> it = this.f79e.iterator();
        while (it.hasNext()) {
            it.next().mo118a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m45f(AbstractC0032b abstractC0032b, Handler handler) {
        if (abstractC0032b == null) {
            this.f77c.mo61c(null, null);
            return;
        }
        InterfaceC0033c interfaceC0033c = this.f77c;
        if (handler == null) {
            handler = new Handler();
        }
        interfaceC0033c.mo61c(abstractC0032b, handler);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0029a();

        /* JADX INFO: renamed from: f */
        public ResultReceiver f82f;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public class C0029a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f82f = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f82f.writeToParcel(parcel, i);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f82f = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    @SuppressLint({"WrongConstant"})
    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, VersionedParcelable versionedParcelable) {
        MediaSession mediaSession;
        this.f79e = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i = MediaButtonReceiver.f809a;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers.size() == 1) {
                        ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        if (listQueryBroadcastReceivers.size() > 1) {
                            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                        }
                        componentName = null;
                    }
                    if (componentName == null) {
                        Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                    }
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, f75a);
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    mediaSession = new MediaSession(context, str, bundle);
                } else {
                    mediaSession = new MediaSession(context, str);
                }
                if (i2 >= 29) {
                    this.f77c = new C0036f(mediaSession, versionedParcelable, bundle);
                } else if (i2 >= 28) {
                    this.f77c = new C0035e(mediaSession, versionedParcelable, bundle);
                } else {
                    this.f77c = new C0034d(mediaSession, versionedParcelable, bundle);
                }
                m45f(new C0031a(this), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f77c.mo65g(pendingIntent);
                this.f78d = new MediaControllerCompat(context, this);
                if (f76b == 0) {
                    f76b = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
