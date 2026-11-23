package p007c.p190n.p194b.p209b.p218q1;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.p212b2.Log;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.p228k0.PsshAtomUtil;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.q1.e0, reason: use source file name */
/* JADX INFO: compiled from: FrameworkMediaDrm.java */
/* JADX INFO: loaded from: classes.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f7330a = 0;

    /* JADX INFO: renamed from: b */
    public final UUID f7331b;

    /* JADX INFO: renamed from: c */
    public final MediaDrm f7332c;

    /* JADX INFO: renamed from: d */
    public int f7333d;

    public FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        Objects.requireNonNull(uuid);
        UUID uuid2 = C.f6404b;
        C2096e.m4567c(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7331b = uuid;
        MediaDrm mediaDrm = new MediaDrm((Util6.f6307a >= 27 || !C.f6405c.equals(uuid)) ? uuid : uuid2);
        this.f7332c = mediaDrm;
        this.f7333d = 1;
        if (C.f6406d.equals(uuid) && "ASUS_Z00AD".equals(Util6.f6310d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: a */
    public synchronized void mo3651a() {
        C2096e.m4570f(this.f7333d > 0);
        this.f7333d++;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: b */
    public Class<FrameworkMediaCrypto> mo3652b() {
        return FrameworkMediaCrypto.class;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: c */
    public Map<String, String> mo3653c(byte[] bArr) {
        return this.f7332c.queryKeyStatus(bArr);
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: d */
    public ExoMediaCrypto mo3654d(byte[] bArr) throws MediaCryptoException {
        int i = Util6.f6307a;
        boolean z = i < 21 && C.f6406d.equals(this.f7331b) && "L3".equals(this.f7332c.getPropertyString("securityLevel"));
        UUID uuid = this.f7331b;
        if (i < 27 && C.f6405c.equals(uuid)) {
            uuid = C.f6404b;
        }
        return new FrameworkMediaCrypto(uuid, bArr, z);
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: e */
    public ExoMediaDrm.e mo3655e() {
        MediaDrm.ProvisionRequest provisionRequest = this.f7332c.getProvisionRequest();
        return new ExoMediaDrm.e(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: f */
    public byte[] mo3656f() throws MediaDrmException {
        return this.f7332c.openSession();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: g */
    public void mo3657g(byte[] bArr, byte[] bArr2) {
        this.f7332c.restoreKeys(bArr, bArr2);
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: h */
    public void mo3658h(byte[] bArr) {
        this.f7332c.closeSession(bArr);
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: i */
    public void mo3659i(final ExoMediaDrm.c cVar) {
        this.f7332c.setOnEventListener(new MediaDrm.OnEventListener() { // from class: c.n.b.b.q1.m
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                FrameworkMediaDrm frameworkMediaDrm = this.f7355a;
                ExoMediaDrm.c cVar2 = cVar;
                Objects.requireNonNull(frameworkMediaDrm);
                DefaultDrmSessionManager.d dVar = ((DefaultDrmSessionManager.c) cVar2).f7421a.f7412x;
                Objects.requireNonNull(dVar);
                dVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: j */
    public byte[] mo3660j(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (C.f6405c.equals(this.f7331b) && Util6.f6307a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(Util6.m3127o(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = Util6.m3093B(sb.toString());
            } catch (JSONException e) {
                StringBuilder sbM1556G = outline.m1556G("Failed to adjust response data: ");
                sbM1556G.append(Util6.m3127o(bArr2));
                Log.m3154b("ClearKeyUtil", sbM1556G.toString(), e);
            }
        }
        return this.f7332c.provideKeyResponse(bArr, bArr2);
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: k */
    public void mo3661k(byte[] bArr) throws DeniedByServerException {
        this.f7332c.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x018f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d2  */
    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: l */
    public ExoMediaDrm.b mo3662l(byte[] bArr, List<DrmInitData.b> list, int i, HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        DrmInitData.b bVar;
        PsshAtomUtil psshAtomUtilM2405u;
        int i3;
        int i4;
        boolean z;
        UUID uuid;
        byte[] bArrM2391g;
        UUID uuid2;
        int i5;
        String str2;
        byte[] bArrM2406v;
        String str3;
        String str4;
        byte[] bArrM2406v2;
        short sM3204i;
        DrmInitData.b bVar2 = null;
        if (list != null) {
            if (C.f6406d.equals(this.f7331b)) {
                if (Util6.f6307a < 28 || list.size() <= 1) {
                    i2 = 0;
                    while (true) {
                        if (i2 < list.size()) {
                            DrmInitData.b bVar3 = list.get(i2);
                            byte[] bArr3 = bVar3.f7436j;
                            Objects.requireNonNull(bArr3);
                            psshAtomUtilM2405u = C1095a.m2405u(bArr3);
                            if (psshAtomUtilM2405u == null) {
                                i3 = -1;
                            } else {
                                i3 = psshAtomUtilM2405u.f7968b;
                            }
                            i4 = Util6.f6307a;
                            if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                                bVar2 = bVar3;
                            }
                        } else {
                            bVar = list.get(0);
                        }
                    }
                } else {
                    DrmInitData.b bVar4 = list.get(0);
                    int i6 = 0;
                    int length = 0;
                    while (true) {
                        if (i6 >= list.size()) {
                            z = true;
                            break;
                        }
                        DrmInitData.b bVar5 = list.get(i6);
                        byte[] bArr4 = bVar5.f7436j;
                        Objects.requireNonNull(bArr4);
                        if (Util6.m3113a(bVar5.f7435i, bVar4.f7435i) && Util6.m3113a(bVar5.f7434h, bVar4.f7434h)) {
                            if (C1095a.m2405u(bArr4) != null) {
                                length += bArr4.length;
                                i6++;
                            }
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        byte[] bArr5 = new byte[length];
                        int i7 = 0;
                        for (int i8 = 0; i8 < list.size(); i8++) {
                            byte[] bArr6 = list.get(i8).f7436j;
                            Objects.requireNonNull(bArr6);
                            int length2 = bArr6.length;
                            System.arraycopy(bArr6, 0, bArr5, i7, length2);
                            i7 += length2;
                        }
                        bVar = new DrmInitData.b(bVar4.f7433g, bVar4.f7434h, bVar4.f7435i, bArr5);
                    } else {
                        i2 = 0;
                        while (true) {
                            if (i2 < list.size()) {
                                DrmInitData.b bVar6 = list.get(i2);
                                byte[] bArr7 = bVar6.f7436j;
                                Objects.requireNonNull(bArr7);
                                psshAtomUtilM2405u = C1095a.m2405u(bArr7);
                                if (psshAtomUtilM2405u == null) {
                                    i3 = -1;
                                } else {
                                    i3 = psshAtomUtilM2405u.f7968b;
                                }
                                i4 = Util6.f6307a;
                                i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                                bVar2 = bVar6;
                            } else {
                                bVar = list.get(0);
                            }
                        }
                    }
                }
                uuid = this.f7331b;
                bArrM2391g = bVar2.f7436j;
                Objects.requireNonNull(bArrM2391g);
                uuid2 = C.f6407e;
                if (uuid2.equals(uuid)) {
                    bArrM2406v2 = C1095a.m2406v(bArrM2391g, uuid);
                    if (bArrM2406v2 != null) {
                        bArrM2391g = bArrM2406v2;
                    }
                    ParsableByteArray parsableByteArray = new ParsableByteArray(bArrM2391g);
                    int iM3203h = parsableByteArray.m3203h();
                    sM3204i = parsableByteArray.m3204i();
                    short sM3204i2 = parsableByteArray.m3204i();
                    if (sM3204i == 1 || sM3204i2 != 1) {
                        android.util.Log.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                    } else {
                        short sM3204i3 = parsableByteArray.m3204i();
                        Charset charset = Charsets.f26132d;
                        String strM3212q = parsableByteArray.m3212q(sM3204i3, charset);
                        if (!strM3212q.contains("<LA_URL>")) {
                            int iIndexOf = strM3212q.indexOf("</DATA>");
                            if (iIndexOf == -1) {
                                android.util.Log.w("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                            }
                            String str5 = strM3212q.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strM3212q.substring(iIndexOf);
                            int i9 = iM3203h + 52;
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i9);
                            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferAllocate.putInt(i9);
                            byteBufferAllocate.putShort(sM3204i);
                            byteBufferAllocate.putShort(sM3204i2);
                            byteBufferAllocate.putShort((short) (str5.length() * 2));
                            byteBufferAllocate.put(str5.getBytes(charset));
                            bArrM2391g = byteBufferAllocate.array();
                        }
                    }
                    bArrM2391g = C1095a.m2391g(uuid2, bArrM2391g);
                }
                i5 = Util6.f6307a;
                if (i5 < 23 || !C.f6406d.equals(uuid)) {
                    if (uuid2.equals(uuid) && "Amazon".equals(Util6.f6309c)) {
                        str2 = Util6.f6310d;
                        if ("AFTB".equals(str2) || "AFTS".equals(str2) || "AFTM".equals(str2) || "AFTT".equals(str2)) {
                            bArrM2406v = C1095a.m2406v(bArrM2391g, uuid);
                            if (bArrM2406v == null) {
                            }
                        }
                    }
                    bArrM2406v = bArrM2391g;
                } else {
                    bArrM2406v = C1095a.m2406v(bArrM2391g, uuid);
                    if (bArrM2406v == null) {
                        bArrM2406v = bArrM2391g;
                    }
                }
                UUID uuid3 = this.f7331b;
                str3 = bVar2.f7435i;
                if (i5 >= 26 && C.f6405c.equals(uuid3) && ("video/mp4".equals(str3) || "audio/mp4".equals(str3))) {
                    str4 = "cenc";
                } else {
                    str4 = str3;
                }
                bArr2 = bArrM2406v;
                str = str4;
            } else {
                bVar = list.get(0);
            }
            bVar2 = bVar;
            uuid = this.f7331b;
            bArrM2391g = bVar2.f7436j;
            Objects.requireNonNull(bArrM2391g);
            uuid2 = C.f6407e;
            if (uuid2.equals(uuid)) {
                bArrM2406v2 = C1095a.m2406v(bArrM2391g, uuid);
                if (bArrM2406v2 != null) {
                    bArrM2391g = bArrM2406v2;
                }
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(bArrM2391g);
                int iM3203h2 = parsableByteArray2.m3203h();
                sM3204i = parsableByteArray2.m3204i();
                short sM3204i4 = parsableByteArray2.m3204i();
                if (sM3204i == 1) {
                    android.util.Log.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                } else {
                    android.util.Log.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM2391g = C1095a.m2391g(uuid2, bArrM2391g);
            }
            i5 = Util6.f6307a;
            if (i5 < 23) {
                if (uuid2.equals(uuid)) {
                    str2 = Util6.f6310d;
                    if ("AFTB".equals(str2)) {
                        bArrM2406v = C1095a.m2406v(bArrM2391g, uuid);
                        if (bArrM2406v == null) {
                        }
                    } else {
                        bArrM2406v = C1095a.m2406v(bArrM2391g, uuid);
                        if (bArrM2406v == null) {
                        }
                    }
                    UUID uuid4 = this.f7331b;
                    str3 = bVar2.f7435i;
                    if (i5 >= 26) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    bArr2 = bArrM2406v;
                    str = str4;
                }
            } else if (uuid2.equals(uuid)) {
                str2 = Util6.f6310d;
                if ("AFTB".equals(str2)) {
                    bArrM2406v = C1095a.m2406v(bArrM2391g, uuid);
                    if (bArrM2406v == null) {
                    }
                } else {
                    bArrM2406v = C1095a.m2406v(bArrM2391g, uuid);
                    if (bArrM2406v == null) {
                    }
                }
                UUID uuid5 = this.f7331b;
                str3 = bVar2.f7435i;
                if (i5 >= 26) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                bArr2 = bArrM2406v;
                str = str4;
            }
            bArrM2406v = bArrM2391g;
            UUID uuid6 = this.f7331b;
            str3 = bVar2.f7435i;
            if (i5 >= 26) {
                str4 = str3;
            } else {
                str4 = str3;
            }
            bArr2 = bArrM2406v;
            str = str4;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f7332c.getKeyRequest(bArr, bArr2, str, i, map);
        UUID uuid7 = this.f7331b;
        byte[] data = keyRequest.getData();
        if (C.f6405c.equals(uuid7) && Util6.f6307a < 27) {
            data = Util6.m3093B(Util6.m3127o(data).replace('+', '-').replace('/', '_'));
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar2 != null && !TextUtils.isEmpty(bVar2.f7434h)) {
            defaultUrl = bVar2.f7434h;
        }
        return new ExoMediaDrm.b(data, defaultUrl, Util6.f6307a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    public synchronized void release() {
        int i = this.f7333d - 1;
        this.f7333d = i;
        if (i == 0) {
            this.f7332c.release();
        }
    }
}
