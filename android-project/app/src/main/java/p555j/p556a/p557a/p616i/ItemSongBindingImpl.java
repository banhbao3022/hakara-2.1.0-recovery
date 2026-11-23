package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Song;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.b2, reason: use source file name */
/* JADX INFO: compiled from: ItemSongBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemSongBindingImpl extends ItemSongBinding {

    /* JADX INFO: renamed from: A */
    public static final SparseIntArray f32425A;

    /* JADX INFO: renamed from: B */
    public long f32426B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32425A = sparseIntArray;
        sparseIntArray.put(R.id.song_content, 5);
        sparseIntArray.put(R.id.btnSing, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemSongBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 7, null, f32425A);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[6], (TextView) objArrM391i[3], (LinearLayout) objArrM391i[5], (TextView) objArrM391i[2], (TextView) objArrM391i[4], (RelativeLayout) objArrM391i[0], (AppCompatImageView) objArrM391i[1]);
        this.f32426B = -1L;
        this.f32391u.setTag(null);
        this.f32392v.setTag(null);
        this.f32393w.setTag(null);
        this.f32394x.setTag(null);
        this.f32395y.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String name;
        String str2;
        int i;
        String artist;
        boolean zIsArtistShow;
        int recordCount;
        long j3;
        long j4;
        synchronized (this) {
            j2 = this.f32426B;
            this.f32426B = 0L;
        }
        Song song = this.f32396z;
        long j5 = j2 & 3;
        String thumbnail = null;
        int i2 = 0;
        if (j5 != 0) {
            if (song != null) {
                thumbnail = song.getThumbnail();
                zIsArtistShow = song.isArtistShow();
                recordCount = song.getRecordCount();
                name = song.getName();
                artist = song.getArtist();
            } else {
                artist = null;
                name = null;
                zIsArtistShow = false;
                recordCount = 0;
            }
            if (j5 != 0) {
                if (zIsArtistShow) {
                    j3 = j2 | 8;
                    j4 = 32;
                } else {
                    j3 = j2 | 4;
                    j4 = 16;
                }
                j2 = j3 | j4;
            }
            i = zIsArtistShow ? 1 : 2;
            int i3 = zIsArtistShow ? 0 : 8;
            str = String.format(this.f32393w.getResources().getString(R.string.msg_recording_count), Integer.valueOf(recordCount));
            i2 = i3;
            str2 = thumbnail;
            thumbnail = artist;
        } else {
            str = null;
            name = null;
            str2 = null;
            i = 0;
        }
        if ((j2 & 3) != 0) {
            TextViewBindingAdapter.m16406a(this.f32391u, thumbnail);
            this.f32391u.setVisibility(i2);
            this.f32392v.setMaxLines(i);
            TextViewBindingAdapter.m16406a(this.f32392v, name);
            TextViewBindingAdapter.m16406a(this.f32393w, str);
            SkuDao.a.m14053E(this.f32395y, str2, null, null, null, true, false, false, 5, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32426B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32426B = 2L;
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
        this.f32396z = (Song) obj;
        synchronized (this) {
            this.f32426B |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
