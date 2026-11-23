package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.mr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3298mr implements InterfaceC3464r8<InterfaceC3704xp> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC3704xp interfaceC3704xp, Map map) {
        InterfaceC3704xp interfaceC3704xp2 = interfaceC3704xp;
        BinderC3263lt binderC3263ltMo6480g = interfaceC3704xp2.mo6480g();
        if (binderC3263ltMo6480g == null) {
            try {
                BinderC3263lt binderC3263lt = new BinderC3263lt(interfaceC3704xp2, Float.parseFloat((String) map.get(CainMediaMetadataRetriever.METADATA_KEY_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                interfaceC3704xp2.mo6506u(binderC3263lt);
                binderC3263ltMo6480g = binderC3263lt;
            } catch (NullPointerException e) {
                e = e;
                C2622l.m5438t3("Unable to parse videoMeta message.", e);
                C2998en c2998en = C2330u.f10884a.f10893h;
                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                C2622l.m5438t3("Unable to parse videoMeta message.", e);
                C2998en c2998en2 = C2330u.f10884a.f10893h;
                C3696xh.m8734c(c2998en2.f13616e, c2998en2.f13617f).mo8736b(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get(CainMediaMetadataRetriever.METADATA_KEY_DURATION));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get("currentTime"));
        int i = Integer.parseInt((String) map.get("playbackState"));
        int i2 = 0;
        if (i >= 0 && i <= 3) {
            i2 = i;
        }
        String str = (String) map.get("aspectRatio");
        float f3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (C2622l.m5281L3(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f2);
            sb.append(" , duration : ");
            sb.append(f);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(i2);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            C2622l.m5318U2(sb.toString());
        }
        binderC3263ltMo6480g.m7614H6(f2, f, i2, zEquals, f3);
    }
}
