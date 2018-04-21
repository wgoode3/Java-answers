package com.hygogg.dojoOverflow.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hygogg.dojoOverflow.Models.Tag;
import com.hygogg.dojoOverflow.Repositories.TagRepository;

@Service
public class TagService {
	
	@Autowired
	private TagRepository tagRepository;
	
	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}
	
	public Tag create(Tag tag) {
		ArrayList<Tag> tags = tagRepository.findBySubject(tag.getSubject());
		if(tags.size() == 0) {
			return tagRepository.save(tag);
		} else {
			return tags.get(0);
		}
	}
	
}
