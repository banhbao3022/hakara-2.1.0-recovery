package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p607a.NowPlayingMetadata;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.t0, reason: use source file name */
/* JADX INFO: compiled from: ItemDraftBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemDraftBindingImpl extends ItemDraftBinding {

    /* JADX INFO: renamed from: y */
    public static final SparseIntArray f32843y;

    /* JADX INFO: renamed from: A */
    public final TextView f32844A;

    /* JADX INFO: renamed from: B */
    public final TextView f32845B;

    /* JADX INFO: renamed from: C */
    public long f32846C;

    /* JADX INFO: renamed from: z */
    public final CardView f32847z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32843y = sparseIntArray;
        sparseIntArray.put(R.id.rootView, 5);
        sparseIntArray.put(R.id.song_content, 6);
        sparseIntArray.put(R.id.btnMore, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemDraftBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 8, null, f32843y);
        super(dataBindingComponent, view, 0, (ImageView) objArrM391i[7], (RelativeLayout) objArrM391i[5], (LinearLayout) objArrM391i[6], (TextView) objArrM391i[2], (AppCompatImageView) objArrM391i[1]);
        this.f32846C = -1L;
        CardView cardView = (CardView) objArrM391i[0];
        this.f32847z = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArrM391i[3];
        this.f32844A = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[4];
        this.f32845B = textView2;
        textView2.setTag(null);
        this.f32809v.setTag(null);
        this.f32810w.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j2 = this.f32846C;
            this.f32846C = 0L;
        }
        RecordingEntity recordingEntity = this.f32811x;
        int iM393n = 0;
        long j3 = j2 & 3;
        String str5 = null;
        Integer num = null;
        if (j3 != 0) {
            if (recordingEntity != null) {
                str = recordingEntity.f32331g;
                str3 = recordingEntity.f32336l;
                str4 = recordingEntity.f32329C;
                num = recordingEntity.f32341q;
            } else {
                str = null;
                str3 = null;
                str4 = null;
            }
            iM393n = ViewDataBinding.m393n(num);
            str2 = str3;
            str5 = str4;
        } else {
            str = null;
            str2 = null;
        }
        if (j3 != 0) {
            TextView textView = this.f32844A;
            Intrinsics2.m13089e(textView, "$this$duration");
            textView.setText(NowPlayingMetadata.f32263a.m14034a(iM393n));
            SkuDao.a.m14082d0(this.f32845B, str5);
            TextViewBindingAdapter.m16406a(this.f32809v, str);
            SkuDao.a.m14053E(this.f32810w, str2, null, null, null, true, false, false, 5, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32846C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32846C = 2L;
        }
        m401m();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: j */
    public boolean mo399j(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (8 != i) {
            return false;
        }
        this.f32811x = (RecordingEntity) obj;
        synchronized (this) {
            this.f32846C |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
