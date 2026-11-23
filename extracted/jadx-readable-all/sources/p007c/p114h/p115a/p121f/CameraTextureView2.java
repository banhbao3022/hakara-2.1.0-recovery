package p007c.p114h.p115a.p121f;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import java.util.Objects;
import p007c.p114h.p115a.p117b.CameraPreviewFragment2;
import p636z0.p725k.p739l.GestureDetectorCompat;

/* JADX INFO: renamed from: c.h.a.f.b, reason: use source file name */
/* JADX INFO: compiled from: CameraTextureView.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraTextureView2 extends TextureView {

    /* JADX INFO: renamed from: f */
    public c f3955f;

    /* JADX INFO: renamed from: g */
    public b f3956g;

    /* JADX INFO: renamed from: h */
    public GestureDetectorCompat f3957h;

    /* JADX INFO: renamed from: i */
    public final GestureDetector.OnDoubleTapListener f3958i;

    /* JADX INFO: renamed from: c.h.a.f.b$a */
    /* JADX INFO: compiled from: CameraTextureView.java */
    public class a implements GestureDetector.OnDoubleTapListener {
        public a() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            b bVar = CameraTextureView2.this.f3956g;
            if (bVar == null) {
                return false;
            }
            motionEvent.getX();
            motionEvent.getY();
            CameraPreviewFragment2.this.m2073d1();
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            CameraTextureView2 cameraTextureView2 = CameraTextureView2.this;
            motionEvent.getX();
            Objects.requireNonNull(cameraTextureView2);
            CameraTextureView2 cameraTextureView3 = CameraTextureView2.this;
            motionEvent.getY();
            Objects.requireNonNull(cameraTextureView3);
            b bVar = CameraTextureView2.this.f3956g;
            if (bVar == null) {
                return true;
            }
            motionEvent.getX();
            motionEvent.getY();
            CameraPreviewFragment2.this.m2069Z0();
            return true;
        }
    }

    /* JADX INFO: renamed from: c.h.a.f.b$b */
    /* JADX INFO: compiled from: CameraTextureView.java */
    public interface b {
    }

    /* JADX INFO: renamed from: c.h.a.f.b$c */
    /* JADX INFO: compiled from: CameraTextureView.java */
    public interface c {
    }

    public CameraTextureView2(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ((GestureDetectorCompat.b) this.f3957h.f38056a).f38057a.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public CameraTextureView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraTextureView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.f3958i = aVar;
        setClickable(true);
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(getContext(), new CameraTextureView(this));
        this.f3957h = gestureDetectorCompat;
        ((GestureDetectorCompat.b) gestureDetectorCompat.f38056a).f38057a.setOnDoubleTapListener(aVar);
    }
}
