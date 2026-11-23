package p007c.p190n.p194b.p209b.p243w1.p248w0;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.p245u0.BaseMediaChunkIterator;
import p007c.p190n.p194b.p209b.p243w1.p245u0.Chunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.DataChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunkIterator;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.DefaultHlsPlaylistTracker;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsMediaPlaylist;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistTracker;
import p007c.p190n.p194b.p209b.p262y1.BaseTrackSelection;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.j, reason: use source file name */
/* JADX INFO: compiled from: HlsChunkSource.java */
/* JADX INFO: loaded from: classes.dex */
public class HlsChunkSource {

    /* JADX INFO: renamed from: a */
    public final HlsExtractorFactory f9360a;

    /* JADX INFO: renamed from: b */
    public final DataSource3 f9361b;

    /* JADX INFO: renamed from: c */
    public final DataSource3 f9362c;

    /* JADX INFO: renamed from: d */
    public final TimestampAdjusterProvider f9363d;

    /* JADX INFO: renamed from: e */
    public final Uri[] f9364e;

    /* JADX INFO: renamed from: f */
    public final Format[] f9365f;

    /* JADX INFO: renamed from: g */
    public final HlsPlaylistTracker f9366g;

    /* JADX INFO: renamed from: h */
    public final TrackGroup f9367h;

    /* JADX INFO: renamed from: i */
    public final List<Format> f9368i;

    /* JADX INFO: renamed from: k */
    public boolean f9370k;

    /* JADX INFO: renamed from: m */
    public IOException f9372m;

    /* JADX INFO: renamed from: n */
    public Uri f9373n;

    /* JADX INFO: renamed from: o */
    public boolean f9374o;

    /* JADX INFO: renamed from: p */
    public ExoTrackSelection2 f9375p;

    /* JADX INFO: renamed from: r */
    public boolean f9377r;

    /* JADX INFO: renamed from: j */
    public final FullSegmentEncryptionKeyCache f9369j = new FullSegmentEncryptionKeyCache(4);

    /* JADX INFO: renamed from: l */
    public byte[] f9371l = Util6.f6312f;

    /* JADX INFO: renamed from: q */
    public long f9376q = -9223372036854775807L;

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.j$a */
    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class a extends DataChunk {

        /* JADX INFO: renamed from: l */
        public byte[] f9378l;

        public a(DataSource3 dataSource3, DataSpec dataSpec, Format format, int i, Object obj, byte[] bArr) {
            super(dataSource3, dataSpec, 3, format, i, obj, bArr);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.DataChunk
        /* JADX INFO: renamed from: c */
        public void mo4223c(byte[] bArr, int i) {
            this.f9378l = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.j$b */
    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Chunk f9379a = null;

        /* JADX INFO: renamed from: b */
        public boolean f9380b = false;

        /* JADX INFO: renamed from: c */
        public Uri f9381c = null;
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.j$c */
    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class c extends BaseMediaChunkIterator {

        /* JADX INFO: renamed from: c */
        public final List<HlsMediaPlaylist.e> f9382c;

        public c(String str, long j2, List<HlsMediaPlaylist.e> list) {
            super(0L, list.size() - 1);
            this.f9382c = list;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.j$d */
    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class d extends BaseTrackSelection {

        /* JADX INFO: renamed from: g */
        public int f9383g;

        public d(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.f9383g = mo4518k(trackGroup.f9065g[iArr[0]]);
        }

        @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
        /* JADX INFO: renamed from: b */
        public int mo4302b() {
            return this.f9383g;
        }

        @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
        /* JADX INFO: renamed from: l */
        public void mo4303l(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (m4524u(this.f9383g, jElapsedRealtime)) {
                for (int i = this.f10227b - 1; i >= 0; i--) {
                    if (!m4524u(i, jElapsedRealtime)) {
                        this.f9383g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
        /* JADX INFO: renamed from: o */
        public int mo4304o() {
            return 0;
        }

        @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
        /* JADX INFO: renamed from: q */
        public Object mo4305q() {
            return null;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.j$e */
    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final HlsMediaPlaylist.e f9384a;

        /* JADX INFO: renamed from: b */
        public final long f9385b;

        /* JADX INFO: renamed from: c */
        public final int f9386c;

        /* JADX INFO: renamed from: d */
        public final boolean f9387d;

        public e(HlsMediaPlaylist.e eVar, long j2, int i) {
            this.f9384a = eVar;
            this.f9385b = j2;
            this.f9386c = i;
            this.f9387d = (eVar instanceof HlsMediaPlaylist.b) && ((HlsMediaPlaylist.b) eVar).f9590r;
        }
    }

    public HlsChunkSource(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, HlsDataSourceFactory hlsDataSourceFactory, TransferListener transferListener, TimestampAdjusterProvider timestampAdjusterProvider, List<Format> list) {
        this.f9360a = hlsExtractorFactory;
        this.f9366g = hlsPlaylistTracker;
        this.f9364e = uriArr;
        this.f9365f = formatArr;
        this.f9363d = timestampAdjusterProvider;
        this.f9368i = list;
        DataSource3 dataSource3Mo4296a = hlsDataSourceFactory.mo4296a(1);
        this.f9361b = dataSource3Mo4296a;
        if (transferListener != null) {
            dataSource3Mo4296a.mo2915c(transferListener);
        }
        this.f9362c = hlsDataSourceFactory.mo4296a(3);
        this.f9367h = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((formatArr[i].f6927j & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f9375p = new d(this.f9367h, C4799a.m11011r0(arrayList));
    }

    /* JADX INFO: renamed from: a */
    public MediaChunkIterator[] m4298a(HlsMediaChunk hlsMediaChunk, long j2) {
        List listUnmodifiableList;
        int iM4192a = hlsMediaChunk == null ? -1 : this.f9367h.m4192a(hlsMediaChunk.f9112d);
        int length = this.f9375p.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iMo4517i = this.f9375p.mo4517i(i);
            Uri uri = this.f9364e[iMo4517i];
            if (((DefaultHlsPlaylistTracker) this.f9366g).m4338e(uri)) {
                HlsMediaPlaylist hlsMediaPlaylistM4336c = ((DefaultHlsPlaylistTracker) this.f9366g).m4336c(uri, z);
                Objects.requireNonNull(hlsMediaPlaylistM4336c);
                long j3 = hlsMediaPlaylistM4336c.f9574f - ((DefaultHlsPlaylistTracker) this.f9366g).f9538u;
                Pair<Long, Integer> pairM4300c = m4300c(hlsMediaChunk, iMo4517i != iM4192a, hlsMediaPlaylistM4336c, j3, j2);
                long jLongValue = ((Long) pairM4300c.first).longValue();
                int iIntValue = ((Integer) pairM4300c.second).intValue();
                String str = hlsMediaPlaylistM4336c.f9611a;
                int i2 = (int) (jLongValue - hlsMediaPlaylistM4336c.f9577i);
                if (i2 < 0 || hlsMediaPlaylistM4336c.f9584p.size() < i2) {
                    AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
                    listUnmodifiableList = RegularImmutableList.f26218h;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < hlsMediaPlaylistM4336c.f9584p.size()) {
                        if (iIntValue != -1) {
                            HlsMediaPlaylist.d dVar = hlsMediaPlaylistM4336c.f9584p.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(dVar);
                            } else if (iIntValue < dVar.f9594r.size()) {
                                List<HlsMediaPlaylist.b> list = dVar.f9594r;
                                arrayList.addAll(list.subList(iIntValue, list.size()));
                            }
                            i2++;
                        }
                        List<HlsMediaPlaylist.d> list2 = hlsMediaPlaylistM4336c.f9584p;
                        arrayList.addAll(list2.subList(i2, list2.size()));
                        iIntValue = 0;
                    }
                    if (hlsMediaPlaylistM4336c.f9580l != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < hlsMediaPlaylistM4336c.f9585q.size()) {
                            List<HlsMediaPlaylist.b> list3 = hlsMediaPlaylistM4336c.f9585q;
                            arrayList.addAll(list3.subList(iIntValue, list3.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                mediaChunkIteratorArr[i] = new c(str, j3, listUnmodifiableList);
            } else {
                mediaChunkIteratorArr[i] = MediaChunkIterator.f9161a;
            }
            i++;
            z = false;
        }
        return mediaChunkIteratorArr;
    }

    /* JADX INFO: renamed from: b */
    public int m4299b(HlsMediaChunk hlsMediaChunk) {
        if (hlsMediaChunk.f9406p == -1) {
            return 1;
        }
        HlsMediaPlaylist hlsMediaPlaylistM4336c = ((DefaultHlsPlaylistTracker) this.f9366g).m4336c(this.f9364e[this.f9367h.m4192a(hlsMediaChunk.f9112d)], false);
        Objects.requireNonNull(hlsMediaPlaylistM4336c);
        int i = (int) (hlsMediaChunk.f9160j - hlsMediaPlaylistM4336c.f9577i);
        if (i < 0) {
            return 1;
        }
        List<HlsMediaPlaylist.b> list = i < hlsMediaPlaylistM4336c.f9584p.size() ? hlsMediaPlaylistM4336c.f9584p.get(i).f9594r : hlsMediaPlaylistM4336c.f9585q;
        if (hlsMediaChunk.f9406p >= list.size()) {
            return 2;
        }
        HlsMediaPlaylist.b bVar = list.get(hlsMediaChunk.f9406p);
        if (bVar.f9590r) {
            return 0;
        }
        return Util6.m3113a(Uri.parse(C2096e.m4584t(hlsMediaPlaylistM4336c.f9611a, bVar.f9595f)), hlsMediaChunk.f9110b.f6137a) ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public final Pair<Long, Integer> m4300c(HlsMediaChunk hlsMediaChunk, boolean z, HlsMediaPlaylist hlsMediaPlaylist, long j2, long j3) {
        int i = -1;
        if (hlsMediaChunk != null && !z) {
            if (!hlsMediaChunk.f9398I) {
                return new Pair<>(Long.valueOf(hlsMediaChunk.f9160j), Integer.valueOf(hlsMediaChunk.f9406p));
            }
            Long lValueOf = Long.valueOf(hlsMediaChunk.f9406p == -1 ? hlsMediaChunk.mo4221c() : hlsMediaChunk.f9160j);
            int i2 = hlsMediaChunk.f9406p;
            return new Pair<>(lValueOf, Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j4 = hlsMediaPlaylist.f9587s + j2;
        if (hlsMediaChunk != null && !this.f9374o) {
            j3 = hlsMediaChunk.f9115g;
        }
        if (!hlsMediaPlaylist.f9581m && j3 >= j4) {
            return new Pair<>(Long.valueOf(hlsMediaPlaylist.f9577i + ((long) hlsMediaPlaylist.f9584p.size())), -1);
        }
        long j5 = j3 - j2;
        int iM3116d = Util6.m3116d(hlsMediaPlaylist.f9584p, Long.valueOf(j5), true, !((DefaultHlsPlaylistTracker) this.f9366g).f9537t || hlsMediaChunk == null);
        long j6 = ((long) iM3116d) + hlsMediaPlaylist.f9577i;
        if (iM3116d >= 0) {
            HlsMediaPlaylist.d dVar = hlsMediaPlaylist.f9584p.get(iM3116d);
            List<HlsMediaPlaylist.b> list = j5 < dVar.f9599j + dVar.f9597h ? dVar.f9594r : hlsMediaPlaylist.f9585q;
            for (int i3 = 0; i3 < list.size(); i3++) {
                HlsMediaPlaylist.b bVar = list.get(i3);
                if (j5 < bVar.f9599j + bVar.f9597h) {
                    if (!bVar.f9589q) {
                        break;
                    }
                    j6 += list == hlsMediaPlaylist.f9585q ? 1L : 0L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j6), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: d */
    public final Chunk m4301d(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] bArrRemove = this.f9369j.f9358a.remove(uri);
        if (bArrRemove != null) {
            this.f9369j.f9358a.put(uri, bArrRemove);
            return null;
        }
        DataSpec.b bVar = new DataSpec.b();
        bVar.f6147a = uri;
        bVar.f6155i = 1;
        return new a(this.f9362c, bVar.m3005a(), this.f9365f[i], this.f9375p.mo4304o(), this.f9375p.mo4305q(), this.f9371l);
    }
}
