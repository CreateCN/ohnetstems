
package io.github.createcn.ohnetstems.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.createcn.ohnetstems.entity.XueWangEntity;
import io.github.createcn.ohnetstems.client.model.Modelxuewang;

public class XueWangRenderer extends MobRenderer<XueWangEntity, Modelxuewang<XueWangEntity>> {
	public XueWangRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelxuewang(context.bakeLayer(Modelxuewang.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(XueWangEntity entity) {
		return new ResourceLocation("ohnetstems:textures/entities/xyewang.png");
	}
}
