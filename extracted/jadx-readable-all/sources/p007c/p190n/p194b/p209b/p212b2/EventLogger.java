package p007c.p190n.p194b.p209b.p212b2;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.PlaybackParameters;
import p007c.p190n.p194b.p209b.Player2;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsListener;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.MappingTrackSelector;
import p007c.p190n.p194b.p209b.p262y1.TrackSelection;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectionArray;

/* JADX INFO: renamed from: c.n.b.b.b2.n, reason: use source file name */
/* JADX INFO: compiled from: EventLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class EventLogger implements AnalyticsListener2 {

    /* JADX INFO: renamed from: f */
    public static final NumberFormat f6340f;

    /* JADX INFO: renamed from: g */
    public final MappingTrackSelector f6341g;

    /* JADX INFO: renamed from: h */
    public final String f6342h;

    /* JADX INFO: renamed from: i */
    public final Timeline.c f6343i;

    /* JADX INFO: renamed from: j */
    public final Timeline.b f6344j;

    /* JADX INFO: renamed from: k */
    public final long f6345k;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f6340f = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger(MappingTrackSelector mappingTrackSelector) {
        this(mappingTrackSelector, "EventLogger");
    }

    /* JADX INFO: renamed from: e */
    public static String m3144e(long j2) {
        return j2 == -9223372036854775807L ? "?" : f6340f.format(j2 / 1000.0f);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: A */
    public void mo1028A(AnalyticsListener2.a aVar, Metadata metadata) {
        StringBuilder sbM1556G = outline.m1556G("metadata [");
        sbM1556G.append(m3146b(aVar));
        Log.d(this.f6342h, sbM1556G.toString());
        m3147s(metadata, "  ");
        Log.d(this.f6342h, "]");
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: B */
    public void mo1029B(AnalyticsListener2.a aVar, int i) {
        String str;
        if (i == 0) {
            str = "OFF";
        } else if (i != 1) {
            str = i != 2 ? "?" : "ALL";
        } else {
            str = "ONE";
        }
        Log.d(this.f6342h, m3145a(aVar, "repeatMode", str, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void mo1030C(Player2 player2, AnalyticsListener2.b bVar) {
        AnalyticsListener.m3490j(this, player2, bVar);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void mo1031D(AnalyticsListener2.a aVar, boolean z, int i) {
        AnalyticsListener.m3491k(this, aVar, z, i);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: E */
    public void mo1032E(AnalyticsListener2.a aVar, int i) {
        String str;
        if (i == 1) {
            str = "IDLE";
        } else if (i == 2) {
            str = "BUFFERING";
        } else if (i != 3) {
            str = i != 4 ? "?" : "ENDED";
        } else {
            str = "READY";
        }
        Log.d(this.f6342h, m3145a(aVar, "state", str, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void mo1033F(AnalyticsListener2.a aVar, Format format) {
        AnalyticsListener.m3482b(this, aVar, format);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: G */
    public void mo1034G(AnalyticsListener2.a aVar) {
        Log.d(this.f6342h, m3145a(aVar, "drmKeysLoaded", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void mo1035H(AnalyticsListener2.a aVar, Format format) {
        AnalyticsListener.m3496p(this, aVar, format);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: I */
    public void mo1036I(AnalyticsListener2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: J */
    public void mo1037J(AnalyticsListener2.a aVar, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        String str;
        MappingTrackSelector mappingTrackSelector = this.f6341g;
        MappingTrackSelector.a aVar2 = mappingTrackSelector != null ? mappingTrackSelector.f10339c : null;
        if (aVar2 == null) {
            Log.d(this.f6342h, m3145a(aVar, "tracks", "[]", null));
            return;
        }
        StringBuilder sbM1556G = outline.m1556G("tracks [");
        sbM1556G.append(m3146b(aVar));
        Log.d(this.f6342h, sbM1556G.toString());
        int i = aVar2.f10340a;
        int i2 = 0;
        while (true) {
            String str2 = "[ ]";
            String str3 = "    Group:";
            String str4 = "  ]";
            if (i2 >= i) {
                String str5 = "[ ]";
                String str6 = "    Group:";
                TrackGroupArray trackGroupArray2 = aVar2.f10346g;
                if (trackGroupArray2.f9068g > 0) {
                    Log.d(this.f6342h, "  Unmapped [");
                    int i3 = 0;
                    while (i3 < trackGroupArray2.f9068g) {
                        String str7 = str6;
                        Log.d(this.f6342h, outline.m1592n(str7, i3, " ["));
                        TrackGroup trackGroup = trackGroupArray2.f9069h[i3];
                        int i4 = 0;
                        while (i4 < trackGroup.f9064f) {
                            String strM3235a = C.m3235a(0);
                            StringBuilder sb = new StringBuilder();
                            sb.append("      ");
                            String str8 = str5;
                            sb.append(str8);
                            sb.append(" Track:");
                            sb.append(i4);
                            sb.append(", ");
                            sb.append(Format.m3514d(trackGroup.f9065g[i4]));
                            sb.append(", supported=");
                            sb.append(strM3235a);
                            Log.d(this.f6342h, sb.toString());
                            i4++;
                            trackGroupArray2 = trackGroupArray2;
                            str5 = str8;
                        }
                        Log.d(this.f6342h, "    ]");
                        i3++;
                        str6 = str7;
                        trackGroupArray2 = trackGroupArray2;
                        str5 = str5;
                    }
                    Log.d(this.f6342h, "  ]");
                }
                Log.d(this.f6342h, "]");
                return;
            }
            TrackGroupArray trackGroupArray3 = aVar2.f10343d[i2];
            TrackSelection trackSelection = trackSelectionArray.f10348b[i2];
            int i5 = i;
            if (trackGroupArray3.f9068g == 0) {
                Log.d(this.f6342h, outline.m1550A(outline.m1556G("  "), aVar2.f10341b[i2], " []"));
            } else {
                Log.d(this.f6342h, outline.m1550A(outline.m1556G("  "), aVar2.f10341b[i2], " ["));
                int i6 = 0;
                while (i6 < trackGroupArray3.f9068g) {
                    TrackGroup trackGroup2 = trackGroupArray3.f9069h[i6];
                    TrackGroupArray trackGroupArray4 = trackGroupArray3;
                    int i7 = trackGroup2.f9064f;
                    String str9 = str2;
                    int iM4545a = aVar2.m4545a(i2, i6, false);
                    String str10 = str4;
                    if (i7 < 2) {
                        str = "N/A";
                    } else if (iM4545a == 0) {
                        str = "NO";
                    } else if (iM4545a == 8) {
                        str = "YES_NOT_SEAMLESS";
                    } else {
                        if (iM4545a != 16) {
                            throw new IllegalStateException();
                        }
                        str = "YES";
                    }
                    Log.d(this.f6342h, str3 + i6 + ", adaptive_supported=" + str + " [");
                    int i8 = 0;
                    while (i8 < trackGroup2.f9064f) {
                        String str11 = trackSelection != null && trackSelection.mo4512a() == trackGroup2 && trackSelection.mo4523t(i8) != -1 ? "[X]" : str9;
                        Log.d(this.f6342h, "      " + str11 + " Track:" + i8 + ", " + Format.m3514d(trackGroup2.f9065g[i8]) + ", supported=" + C.m3235a(aVar2.m4546b(i2, i6, i8)));
                        i8++;
                        str3 = str3;
                    }
                    Log.d(this.f6342h, "    ]");
                    i6++;
                    trackGroupArray3 = trackGroupArray4;
                    str2 = str9;
                    str4 = str10;
                }
                String str12 = str4;
                if (trackSelection != null) {
                    for (int i9 = 0; i9 < trackSelection.length(); i9++) {
                        Metadata metadata = trackSelection.mo4516f(i9).f6932o;
                        if (metadata != null) {
                            Log.d(this.f6342h, "    Metadata [");
                            m3147s(metadata, "      ");
                            Log.d(this.f6342h, "    ]");
                            break;
                        }
                    }
                }
                Log.d(this.f6342h, str12);
            }
            i2++;
            i = i5;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void mo1038K(AnalyticsListener2.a aVar, long j2) {
        AnalyticsListener.m3484d(this, aVar, j2);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: L */
    public void mo1039L(AnalyticsListener2.a aVar, boolean z) {
        Log.d(this.f6342h, m3145a(aVar, "isPlaying", Boolean.toString(z), null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: M */
    public void mo1040M(AnalyticsListener2.a aVar, MediaLoadData mediaLoadData) {
        Log.d(this.f6342h, m3145a(aVar, "downstreamFormat", Format.m3514d(mediaLoadData.f8842c), null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: N */
    public void mo1041N(AnalyticsListener2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: O */
    public void mo1042O(AnalyticsListener2.a aVar, MediaLoadData mediaLoadData) {
        Log.d(this.f6342h, m3145a(aVar, "upstreamDiscarded", Format.m3514d(mediaLoadData.f8842c), null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: P */
    public void mo1043P(AnalyticsListener2.a aVar, int i, long j2) {
        Log.d(this.f6342h, m3145a(aVar, "droppedFrames", Integer.toString(i), null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void mo1044Q(AnalyticsListener2.a aVar, Exception exc) {
        AnalyticsListener.m3485e(this, aVar, exc);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: R */
    public void mo1045R(AnalyticsListener2.a aVar, boolean z) {
        Log.d(this.f6342h, m3145a(aVar, "skipSilenceEnabled", Boolean.toString(z), null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: S */
    public void mo1046S(AnalyticsListener2.a aVar, String str) {
        Log.d(this.f6342h, m3145a(aVar, "audioDecoderReleased", str, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: T */
    public void mo1047T(AnalyticsListener2.a aVar, boolean z, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        if (i == 1) {
            str = "USER_REQUEST";
        } else if (i == 2) {
            str = "AUDIO_FOCUS_LOSS";
        } else if (i == 3) {
            str = "AUDIO_BECOMING_NOISY";
        } else if (i != 4) {
            str = i != 5 ? "?" : "END_OF_MEDIA_ITEM";
        } else {
            str = "REMOTE";
        }
        sb.append(str);
        Log.d(this.f6342h, m3145a(aVar, "playWhenReady", sb.toString(), null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: U */
    public void mo1048U(AnalyticsListener2.a aVar, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        Log.d(this.f6342h, m3145a(aVar, "videoInputFormat", Format.m3514d(format), null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: V */
    public void mo1049V(AnalyticsListener2.a aVar, int i) {
        int iMo3355i = aVar.f6777b.mo3355i();
        int iMo3356p = aVar.f6777b.mo3356p();
        StringBuilder sbM1556G = outline.m1556G("timeline [");
        sbM1556G.append(m3146b(aVar));
        sbM1556G.append(", periodCount=");
        sbM1556G.append(iMo3355i);
        sbM1556G.append(", windowCount=");
        sbM1556G.append(iMo3356p);
        sbM1556G.append(", reason=");
        sbM1556G.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        Log.d(this.f6342h, sbM1556G.toString());
        for (int i2 = 0; i2 < Math.min(iMo3355i, 3); i2++) {
            aVar.f6777b.m3461f(i2, this.f6344j);
            Log.d(this.f6342h, "  period [" + m3144e(C.m3237c(this.f6344j.f6747d)) + "]");
        }
        if (iMo3355i > 3) {
            Log.d(this.f6342h, "  ...");
        }
        for (int i3 = 0; i3 < Math.min(iMo3356p, 3); i3++) {
            aVar.f6777b.m3468n(i3, this.f6343i);
            Log.d(this.f6342h, "  window [" + m3144e(this.f6343i.m3478b()) + ", seekable=" + this.f6343i.f6759j + ", dynamic=" + this.f6343i.f6760k + "]");
        }
        if (iMo3356p > 3) {
            Log.d(this.f6342h, "  ...");
        }
        Log.d(this.f6342h, "]");
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: W */
    public void mo1050W(AnalyticsListener2.a aVar, String str, long j2) {
        Log.d(this.f6342h, m3145a(aVar, "videoDecoderInitialized", str, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: X */
    public void mo1051X(AnalyticsListener2.a aVar) {
        Log.d(this.f6342h, m3145a(aVar, "seekStarted", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: Y */
    public void mo1052Y(AnalyticsListener2.a aVar, MediaItem2 mediaItem2, int i) {
        String str;
        StringBuilder sbM1556G = outline.m1556G("mediaItem [");
        sbM1556G.append(m3146b(aVar));
        sbM1556G.append(", reason=");
        if (i == 0) {
            str = "REPEAT";
        } else if (i == 1) {
            str = "AUTO";
        } else if (i != 2) {
            str = i != 3 ? "?" : "PLAYLIST_CHANGED";
        } else {
            str = "SEEK";
        }
        Log.d(this.f6342h, outline.m1550A(sbM1556G, str, "]"));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: Z */
    public void mo1053Z(AnalyticsListener2.a aVar, Surface surface) {
        Log.d(this.f6342h, m3145a(aVar, "renderedFirstFrame", String.valueOf(surface), null));
    }

    /* JADX INFO: renamed from: a */
    public final String m3145a(AnalyticsListener2.a aVar, String str, String str2, Throwable th) {
        StringBuilder sbM1561L = outline.m1561L(str, " [");
        sbM1561L.append(m3146b(aVar));
        String string = sbM1561L.toString();
        if (str2 != null) {
            string = outline.m1600v(string, ", ", str2);
        }
        String strM3155c = Log.m3155c(th);
        if (!TextUtils.isEmpty(strM3155c)) {
            StringBuilder sbM1561L2 = outline.m1561L(string, "\n  ");
            sbM1561L2.append(strM3155c.replace("\n", "\n  "));
            sbM1561L2.append('\n');
            string = sbM1561L2.toString();
        }
        return outline.m1599u(string, "]");
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: a0 */
    public void mo1055a0(AnalyticsListener2.a aVar, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        Log.d(this.f6342h, m3145a(aVar, "audioInputFormat", Format.m3514d(format), null));
    }

    /* JADX INFO: renamed from: b */
    public final String m3146b(AnalyticsListener2.a aVar) {
        StringBuilder sbM1556G = outline.m1556G("window=");
        sbM1556G.append(aVar.f6778c);
        String string = sbM1556G.toString();
        if (aVar.f6779d != null) {
            StringBuilder sbM1561L = outline.m1561L(string, ", period=");
            sbM1561L.append(aVar.f6777b.mo3457b(aVar.f6779d.f8857a));
            string = sbM1561L.toString();
            if (aVar.f6779d.m4081a()) {
                StringBuilder sbM1561L2 = outline.m1561L(string, ", adGroup=");
                sbM1561L2.append(aVar.f6779d.f8858b);
                StringBuilder sbM1561L3 = outline.m1561L(sbM1561L2.toString(), ", ad=");
                sbM1561L3.append(aVar.f6779d.f8859c);
                string = sbM1561L3.toString();
            }
        }
        StringBuilder sbM1556G2 = outline.m1556G("eventTime=");
        sbM1556G2.append(m3144e(aVar.f6776a - this.f6345k));
        sbM1556G2.append(", mediaPos=");
        sbM1556G2.append(m3144e(aVar.f6780e));
        sbM1556G2.append(", ");
        sbM1556G2.append(string);
        return sbM1556G2.toString();
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: c */
    public void mo1058c(AnalyticsListener2.a aVar, int i, long j2, long j3) {
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void mo1059c0(AnalyticsListener2.a aVar, int i, DecoderCounters decoderCounters) {
        AnalyticsListener.m3486f(this, aVar, i, decoderCounters);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: d */
    public void mo1060d(AnalyticsListener2.a aVar, int i, int i2, int i3, float f) {
        Log.d(this.f6342h, m3145a(aVar, "videoSize", i + ", " + i2, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: d0 */
    public void mo1061d0(AnalyticsListener2.a aVar, List<Metadata> list) {
        StringBuilder sbM1556G = outline.m1556G("staticMetadata [");
        sbM1556G.append(m3146b(aVar));
        Log.d(this.f6342h, sbM1556G.toString());
        for (int i = 0; i < list.size(); i++) {
            Metadata metadata = list.get(i);
            if (metadata.f8661f.length != 0) {
                Log.d(this.f6342h, outline.m1592n("  Metadata:", i, " ["));
                m3147s(metadata, "    ");
                Log.d(this.f6342h, "  ]");
            }
        }
        Log.d(this.f6342h, "]");
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: e0 */
    public void mo1063e0(AnalyticsListener2.a aVar) {
        Log.d(this.f6342h, m3145a(aVar, "drmSessionAcquired", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: f */
    public void mo1064f(AnalyticsListener2.a aVar, String str) {
        Log.d(this.f6342h, m3145a(aVar, "videoDecoderReleased", str, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: f0 */
    public void mo1065f0(AnalyticsListener2.a aVar, boolean z) {
        Log.d(this.f6342h, m3145a(aVar, "loading", Boolean.toString(z), null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void mo1066g(AnalyticsListener2.a aVar, int i, Format format) {
        AnalyticsListener.m3489i(this, aVar, i, format);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: g0 */
    public void mo1067g0(AnalyticsListener2.a aVar, DecoderCounters decoderCounters) {
        Log.d(this.f6342h, m3145a(aVar, "videoDisabled", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void mo1068h(AnalyticsListener2.a aVar, long j2, int i) {
        AnalyticsListener.m3495o(this, aVar, j2, i);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: h0 */
    public void mo1069h0(AnalyticsListener2.a aVar) {
        Log.d(this.f6342h, m3145a(aVar, "drmKeysRemoved", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void mo1070i(AnalyticsListener2.a aVar) {
        AnalyticsListener.m3492l(this, aVar);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: i0 */
    public void mo1071i0(AnalyticsListener2.a aVar, ExoPlaybackException exoPlaybackException) {
        Log.e(this.f6342h, m3145a(aVar, "playerFailed", null, exoPlaybackException));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: j */
    public void mo1072j(AnalyticsListener2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void mo1073k(AnalyticsListener2.a aVar, int i, String str, long j2) {
        AnalyticsListener.m3488h(this, aVar, i, str, j2);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: l */
    public void mo1074l(AnalyticsListener2.a aVar, int i) {
        String str;
        if (i == 0) {
            str = "PERIOD_TRANSITION";
        } else if (i == 1) {
            str = "SEEK";
        } else if (i == 2) {
            str = "SEEK_ADJUSTMENT";
        } else if (i != 3) {
            str = i != 4 ? "?" : "INTERNAL";
        } else {
            str = "AD_INSERTION";
        }
        Log.d(this.f6342h, m3145a(aVar, "positionDiscontinuity", str, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: m */
    public void mo1075m(AnalyticsListener2.a aVar, Exception exc) {
        Log.e(this.f6342h, m3145a(aVar, "internalError", "drmSessionManagerError", exc));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: n */
    public void mo1076n(AnalyticsListener2.a aVar) {
        Log.d(this.f6342h, m3145a(aVar, "drmSessionReleased", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: o */
    public void mo1077o(AnalyticsListener2.a aVar) {
        Log.d(this.f6342h, m3145a(aVar, "drmKeysRestored", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: p */
    public void mo1078p(AnalyticsListener2.a aVar, int i) {
        String str;
        if (i != 0) {
            str = i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS";
        } else {
            str = "NONE";
        }
        Log.d(this.f6342h, m3145a(aVar, "playbackSuppressionReason", str, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: q */
    public void mo1079q(AnalyticsListener2.a aVar, PlaybackParameters playbackParameters) {
        Log.d(this.f6342h, m3145a(aVar, "playbackParameters", playbackParameters.toString(), null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: r */
    public void mo1080r(AnalyticsListener2.a aVar, int i, long j2, long j3) {
        Log.e(this.f6342h, m3145a(aVar, "audioTrackUnderrun", i + ", " + j2 + ", " + j3, null));
    }

    /* JADX INFO: renamed from: s */
    public final void m3147s(Metadata metadata, String str) {
        for (int i = 0; i < metadata.f8661f.length; i++) {
            StringBuilder sbM1556G = outline.m1556G(str);
            sbM1556G.append(metadata.f8661f[i]);
            Log.d(this.f6342h, sbM1556G.toString());
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: t */
    public void mo1082t(AnalyticsListener2.a aVar, DecoderCounters decoderCounters) {
        Log.d(this.f6342h, m3145a(aVar, "audioDisabled", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: u */
    public void mo1083u(AnalyticsListener2.a aVar, DecoderCounters decoderCounters) {
        Log.d(this.f6342h, m3145a(aVar, "audioEnabled", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: w */
    public void mo1085w(AnalyticsListener2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        Log.e(this.f6342h, m3145a(aVar, "internalError", "loadError", iOException));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void mo1086x(AnalyticsListener2.a aVar, int i, DecoderCounters decoderCounters) {
        AnalyticsListener.m3487g(this, aVar, i, decoderCounters);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: y */
    public void mo1087y(AnalyticsListener2.a aVar, DecoderCounters decoderCounters) {
        Log.d(this.f6342h, m3145a(aVar, "videoEnabled", null, null));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: z */
    public void mo1088z(AnalyticsListener2.a aVar, String str, long j2) {
        Log.d(this.f6342h, m3145a(aVar, "audioDecoderInitialized", str, null));
    }

    public EventLogger(MappingTrackSelector mappingTrackSelector, String str) {
        this.f6341g = mappingTrackSelector;
        this.f6342h = str;
        this.f6343i = new Timeline.c();
        this.f6344j = new Timeline.b();
        this.f6345k = SystemClock.elapsedRealtime();
    }
}
