package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.cg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2917cg implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2991eg f12998f;

    public DialogInterfaceOnClickListenerC2917cg(C2991eg c2991eg) {
        this.f12998f = c2991eg;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C2991eg c2991eg = this.f12998f;
        Objects.requireNonNull(c2991eg);
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(CainMediaMetadataRetriever.METADATA_KEY_TITLE, c2991eg.f13581e);
        data.putExtra("eventLocation", c2991eg.f13585i);
        data.putExtra(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION, c2991eg.f13584h);
        long j2 = c2991eg.f13582f;
        if (j2 > -1) {
            data.putExtra("beginTime", j2);
        }
        long j3 = c2991eg.f13583g;
        if (j3 > -1) {
            data.putExtra("endTime", j3);
        }
        data.setFlags(268435456);
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        C2267h1.m4752k(this.f12998f.f13580d, data);
    }
}
